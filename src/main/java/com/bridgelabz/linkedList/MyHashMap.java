package com.bridgelabz.linkedList;

public class MyHashMap<K,V>{
	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList=new MyLinkedList<>();
	}
	//Method for getting value for a particular key
	public V get(K key) {
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	//Method for add key value pair in HashMap
	public void add(K key,V value) {
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)this.myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode=new MyMapNode<>(key,value);
			this.myLinkedList.addElement(myMapNode);
			
		}else {
			myMapNode.setValue(value);
		}
	}
	
}