package com.bridgelabz.linkedList;
public class MyLinkedList<K>{
	public INode<K> head;
	public INode<K> tail;
	public static int count;
	public MyLinkedList() {
		this.head=head;
		this.tail=tail;
	}
	public static int getCount() {
        return count;
    }
	public void add(INode<K> newNode) {
		count++;
		if(this.tail==null) {
			this.tail=newNode;
		}
		if(this.head==null) {
			this.head=newNode;
		}
		else {
			INode<K> tempNode=this.head;
			//INode newNode;
			this.head=newNode;
			this.head.setNext(tempNode);
		}
	}
	////Method to add elements from the back
	public void addElement(INode newNode) {
		count++;
        if (this.head == null) {
            this.head = newNode;
        } 
        if (this.tail == null) {
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
            this.tail = newNode;
        }
    }
	//Method to insert after a specified element
	public void insert(INode destNode, INode newNode) {
		count++;
        INode tempNode = this.head;
        while (!tempNode.getKey().equals(destNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
	}
	//Method to Delete first Element
	public INode pop() {
		count--;
	    INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
	//Method to delete last element
	public INode popLast() throws NullPointerException {
		count--;
        if (this.head == null)
             return null;
        if (this.head.getNext().equals(null))
             return null;
        else {
            INode tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode tempLastNode = tempNode.getNext();
            tempLastNode.setNext(null);
             return tempLastNode;
       }
    }
	//Method for search an element in Linked List
	public INode search(INode element) {
        if (this.head.equals(element))
            return this.head;

        INode tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(element))
                return tempNode;
        }
        return null;
    }
	//Method to delete an element at any index in Linked List
	public INode deleteAtIndex(INode element) {
		count--;
        if (head.equals(element)) {
            INode del = head;
            head = head.getNext();
            return del;
        }
        INode tempDeleteNode= head;
        while (!tempDeleteNode.getNext().equals(element)) {
        	tempDeleteNode = tempDeleteNode.getNext();
        }
        INode tempNode = tempDeleteNode.getNext();
        tempDeleteNode.setNext(tempDeleteNode.getNext().getNext());
        return tempNode;
    }
	public void printMyNodes() {
		StringBuffer myNodes=new StringBuffer("My Nodes: ");
		INode tempNode=head;
		while(tempNode.getNext()!=null) {
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail))
				myNodes.append("->");
			tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}