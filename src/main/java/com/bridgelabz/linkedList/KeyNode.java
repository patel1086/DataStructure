package com.bridgelabz.linkedList;

public class KeyNode<K> implements INode<K>{
	public K key;
	public INode next;
	
	public KeyNode(K key) {
		this.key=key;
		this.next=null;
	}
	
	public INode<K> getNext(){
		return next;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key=key;
	}
	
	public void setNext(INode<K> next) {
		this.next=next;
	}
	
	public String toString() {
		StringBuilder MyNodeString=new StringBuilder();
		MyNodeString.append("MyNode{" + "Key=").append(key).append('}');
		if(next!=null)
			MyNodeString.append("->").append(next);
		return MyNodeString.toString();
	}
	
}