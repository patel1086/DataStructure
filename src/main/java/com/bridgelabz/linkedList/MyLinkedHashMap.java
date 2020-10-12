package com.bridgelabz.linkedList;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V> {
	public final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            this.myBucketArray.add(null);
        }
    }
    //Method to get value using key
    public V get(K word) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null)
            return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }
    //Method to get which index of the Hashtable to use
    private int getBucketIndex(K word) {
        int hashCode = Math.abs(word.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }
    //Method to add a new word in HashMap
    public void add(K word, V value) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(word);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(word, value);
            myLinkedList.addElement(myMapNode);

        } else {
            myMapNode.setValue(value);
        }
    }
    //Method to delete occurance of word in Paragraph
    public K delete(K word) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            return null;
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.deleteAtIndex(word);
        return (myMapNode == null) ? null : myMapNode.getKey();
    }
}
