
import os
import re
from pathlib import Path

# Configuration
SOLUTIONS_DIR = Path("src/com/leetcode/solutions")
README_PATH = Path("README.md")
START_MARKER = "<!-- AUTO-GENERATED-START -->"
END_MARKER = "<!-- AUTO-GENERATED-END -->"

def extract_metadata(java_file_path):
    with open(java_file_path, "r", encoding="utf-8") as file:
        content = file.read()

    metadata = {}
    metadata["file"] = java_file_path.name

    # Extract values from comment block
    match = re.search(r"/\*\*([\s\S]*?)\*/", content)
    if match:
        lines = match.group(1).strip().splitlines()
        for line in lines:
            line = line.strip().lstrip("*").strip()
            if line.startswith("LeetCode ID:"):
                metadata["id"] = line.replace("LeetCode ID:", "").strip()
            elif line.startswith("Title:"):
                metadata["title"] = line.replace("Title:", "").strip()
            elif line.startswith("Difficulty:"):
                metadata["difficulty"] = line.replace("Difficulty:", "").strip()
            elif line.startswith("Topic:"):
                metadata["topic"] = line.replace("Topic:", "").strip()
            elif line.startswith("Link:"):
                metadata["link"] = line.replace("Link:", "").strip()
            elif line.startswith("Time Complexity:"):
                metadata["time_complexity"] = line.replace("Time Complexity:", "").strip()
            elif line.startswith("Space Complexity:"):
                metadata["space_complexity"] = line.replace("Space Complexity:", "").strip()

    return metadata

def generate_table(metadata_list):
    # Sort by problem ID
    metadata_list.sort(key=lambda x: int(x.get("id", "0")))

    table = "| ID | Title | Difficulty | Topic | Solution | Time Complexity | Space Complexity |\n"
    table += "|----|--------|------------|--------|----------|-----------------|-----------------|\n"

    for meta in metadata_list:
        table += f"| [{meta.get('id')}]({meta.get('link')}) | {meta.get('title')} | {meta.get('difficulty')} | {meta.get('topic')} | [{meta.get('file')}]({SOLUTIONS_DIR / meta.get('file')}) | {meta.get('time_complexity')}  | {meta.get('space_complexity')}\n"

    return table

def count_difficulties(metadata_list):
    summary = {"Easy": 0, "Medium": 0, "Hard": 0}
    for meta in metadata_list:
        diff = meta.get("difficulty")
        if diff in summary:
            summary[diff] += 1
    return summary

def update_readme(table, summary):
    with open(README_PATH, "r", encoding="utf-8") as file:
        readme = file.read()

    start_index = readme.find(START_MARKER)
    end_index = readme.find(END_MARKER)

    if start_index == -1 or end_index == -1:
        raise ValueError("Markers not found in README.md")

    total_solved = sum(summary.values())

    # Generate QuickChart pie chart URL
    chart_url = (
        "https://quickchart.io/chart"
        "?c={type:'pie',data:{labels:['Easy','Medium','Hard'],"
        f"datasets:[{{data:[{summary['Easy']},{summary['Medium']},{summary['Hard']}],"
        "backgroundColor:['#4CAF50','#FFC107','#F44336']}}]}}"
    )

    summary_text = (
            f"**🧠 Problems Solved:** {total_solved} total\n\n"
            f"- ✅ Easy: {summary['Easy']}\n"
            f"- ⚠️ Medium: {summary['Medium']}\n"
            f"- 🔥 Hard: {summary['Hard']}\n\n"
            "![Difficulty Distribution](" + chart_url + ")\n\n"
                                                        "**📋 Solution Table:**\n\n"
    )

    new_section = START_MARKER + "\n\n" + summary_text + table + "\n\n" + END_MARKER

    updated_readme = readme[:start_index] + new_section + readme[end_index + len(END_MARKER):]

    with open(README_PATH, "w", encoding="utf-8") as file:
        file.write(updated_readme)


def main():
    solution_files = SOLUTIONS_DIR.glob("*.java")
    all_metadata = [extract_metadata(f) for f in solution_files]
    table = generate_table(all_metadata)
    summary = count_difficulties(all_metadata)
    update_readme(table, summary)
    print("✅ README updated successfully.")

if __name__ == "__main__":
    main()

