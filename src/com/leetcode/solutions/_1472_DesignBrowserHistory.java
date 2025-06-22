package com.leetcode.solutions;

import java.util.ArrayList;

/**
 * LeetCode ID: 1472
 * Title: Design Browser History
 * Difficulty: Medium
 * Topic: Array, Linked List, Stack, Design, Doubly-Linked List, Data Stream
 * Link: https://leetcode.com/problems/design-browser-history/
 * Time Complexity: O(1)
 * Space Complexity: O(n)
 */

public class _1472_DesignBrowserHistory {
//    Using ArrayList
ArrayList<String> pageList;
    int currentPage;
    int lastVisitedPage;

    public _1472_DesignBrowserHistory(String homepage){
        pageList = new ArrayList<>();
        pageList.add(homepage);
        currentPage = 0;
        lastVisitedPage = 0;
    }

    public void visit(String url){
        currentPage++;
        if(currentPage < pageList.size()) pageList.set(currentPage, url);
        else pageList.add(url);

        lastVisitedPage = currentPage;
    }

    public String back(int steps){
        currentPage = Math.max(0, currentPage-steps);
        return pageList.get(currentPage);
    }

    public String forward(int steps){
        currentPage = Math.min(lastVisitedPage, currentPage+steps);
        return pageList.get(currentPage);
    }

//    Using doubly linked list
//    private static class Node{
//        String url;
//        Node prev;
//        Node next;
//        Node(String url){
//            this.url = url;
//        }
//    }
//
//    private Node curr;
//
//    public _1472_DesignBrowserHistory(String homepage){
//        Node curr = new Node(homepage);
//    }
//
//    public void visit (String url){
//        Node newPage = new Node(url);
//        curr.next = null;
//        newPage.prev = curr;
//        curr.next = newPage;
//        curr = newPage;
//    }
//
//    public String back(int steps){
//        while(curr.prev != null && steps-- > 0)
//            curr = curr.prev;
//
//        return curr.url;
//    }
//
//    public String forward(int steps){
//        while(curr.next != null && steps-- > 0)
//            curr = curr.next;
//        return curr.url;
//    }
}
