package com.bridgelabz.linkedList;
public class MyMapNode<K,V> implements INode<K>{
	K key;
	V value;
	MyMapNode<K,V> next;
	
	public MyMapNode(K key,V value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}
	
	public K getKey() {
		return this.key;
	}
	
	public void setValue(V value) {
		this.value=value;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public void setNext(INode<K> next) {
		this.next=(MyMapNode<K,V>) next;
	}
	
	public INode<K> getNext() {
		return next;
	}
	
	public String toString() {
		StringBuilder myMapNodeString=new StringBuilder();
		myMapNodeString.append("myMapNode{"+" k=").append(key).append("V= ").append(value).append("}");
		if(next!=null)
        	myMapNodeString.append("=>").append(next);
		return myMapNodeString.toString();
	}
}