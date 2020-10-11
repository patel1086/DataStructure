package com.bridgelabz.linkedList;

public class MyQueue{
	private final MyLinkedList myLinkedList;
	public MyQueue() {
		this.myLinkedList=new MyLinkedList();
	}
	public void queue(INode myNode) {
		myLinkedList.addElement(myNode);
	}
	public void printQueue() {
		myLinkedList.printMyNodes();
	}
	public INode peak() {
		return myLinkedList.head;
	}
}