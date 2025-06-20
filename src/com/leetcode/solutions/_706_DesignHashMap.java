package com.leetcode.solutions;

import java.util.LinkedList;

/**
 * LeetCode ID: 706
 * Title: Design HashMap
 * Difficulty: Easy
 * Topic: Array, Linked List, Hash Table, Design, Hash Function
 * Link: https://leetcode.com/problems/design-hashmap/
 * Time Complexity: O(1) or O(n)
 * Space Complexity: O(n)
 */

public class _706_DesignHashMap {
    private static class Entry{
        int key;
        int value;

        Entry(int key, int value){
            this.key = key;
            this.value = value;
        }
    }


    private  int capacity, size, threshold;
    private LinkedList<Entry>[] buckets;
    private final float loadFactor = 0.75f;

    public _706_DesignHashMap(){
        this.capacity = 769;
        this.buckets = new LinkedList[capacity];

        for(int i =0; i < capacity; i++) buckets[i] = new LinkedList<>();

        this.size = 0;
        this.threshold = (int) (capacity * loadFactor);
    }

    private int getIndex(int key){
        return key % capacity;
    }

    public void put(int key, int value){
        int index = getIndex(key);

        LinkedList<Entry> bucket = buckets[index];
        for(Entry entry : bucket)
            if(entry.key == key){
                entry.value = value;
                return;
            }

        bucket.add(new Entry(key, value));
        size++;

        if(size > threshold) resize();
    }

    public int get(int key){
        int index = getIndex(key);
        LinkedList<Entry> bucket = buckets[index];

        for(Entry entry : bucket)
            if(entry.key == key)
                return entry.value;

        return -1;
    }

    public void remove(int key){
        int index = getIndex(key);

        LinkedList<Entry> bucket = buckets[index];
        Entry toRemove = null;
        for(Entry entry : bucket)
            if(entry.key == key){
                toRemove = entry;
                break;
            }
        if(toRemove != null) {
            bucket.remove(toRemove);
            size--;
        }
    }

    private void resize(){
        int newCapacity = capacity * 2;

        LinkedList<Entry>[] newBuckets = new LinkedList[newCapacity];
        for(int i = 0; i < newCapacity; i++) newBuckets[i] = new LinkedList<>();

        for(LinkedList<Entry> bucket : buckets)
            for(Entry entry : bucket){
                int newIndex = Math.abs(entry.key) % newCapacity;
                newBuckets[newIndex].add(entry);
            }

        this.capacity = newCapacity;
        this.buckets = newBuckets;
        this.threshold = (int) (newCapacity * loadFactor);
    }
}
