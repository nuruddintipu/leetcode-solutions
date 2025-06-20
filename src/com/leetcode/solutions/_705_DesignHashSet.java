package com.leetcode.solutions;

import java.util.LinkedList;

/**
 * LeetCode ID: 705
 * Title: Design HashSet
 * Difficulty: Easy
 * Topic: Array, Hash Table, Linked List, Design, Hash Function
 * Link: https://leetcode.com/problems/design-hashset/
 * Time Complexity: O(1) avg, O(n) worst
 * Space Complexity: O(n+m)
 */

public class _705_DesignHashSet {
    private LinkedList<Integer>[] buckets;
    private int capacity, size, threshold;
    private final float loadFactor = 0.75f;

    public _705_DesignHashSet(){
        this.capacity = 769;
        this.buckets = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++) buckets[i] = new LinkedList<>();

        this.size = 0;
        this.threshold = (int) (capacity * loadFactor);
    }

    public void add(int key){
        int index = getIndex(key);

        if(!buckets[index].contains(key)){
            buckets[index].add(key);
            size++;

            if(size > threshold) resize();
        }
    }

    public void remove(int key){
        int index = getIndex(key);

        if(buckets[index].remove((Integer) key)) size--;
    }

    public boolean contains(int key){
        int index = getIndex(key);

        return buckets[index].contains(key);
    }

    private int getIndex(int key){
        return key % capacity;
    }

    private void resize(){
        int newCapacity = capacity * 2;
        LinkedList<Integer>[] newBuckets = new LinkedList[newCapacity];

        for(int i = 0; i < newCapacity; i++) newBuckets[i] = new LinkedList<>();

        for(LinkedList<Integer> bucket : buckets){
            for(int key : bucket){
                int newIndex = key % newCapacity;
                newBuckets[newIndex].add(key);
            }
        }

        this.capacity = newCapacity;
        this.buckets = newBuckets;
        this.threshold = (int) (newCapacity * loadFactor);
    }

}
