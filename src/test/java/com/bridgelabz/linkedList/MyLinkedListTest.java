package com.bridgelabz.linkedList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
	MyLinkedList mylinkedList=new MyLinkedList();
	 @Test
	 public void given3NumbersShouldPassLinkedListTest() {
	    KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                			mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
        System.out.println(myFirstNode.toString());
	    }
	@Test
	public void given3NumbersWhenLinkedShouldPasseLinkedListTest() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		mylinkedList.add(myThirdNode);
		mylinkedList.add(mySecondNode);
		mylinkedList.add(myFirstNode);
		boolean result=mylinkedList.head.equals(myFirstNode)
						&&mylinkedList.head.getNext().equals(mySecondNode)
						&&mylinkedList.tail.equals(myThirdNode);
		Assert.assertTrue(result);
		mylinkedList.printMyNodes();
	}
	@Test
	public void given3NumbersShouldPassHeadFromEnd() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) 
        				 && mylinkedList.head.getNext().equals(mySecondNode)
                         && mylinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
	}
	@Test
	public void insertOneNumbertBetweenTwoLinkedListNode() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> newNode=new KeyNode<>(30);
		KeyNode<Integer> mySecondNode=new KeyNode<>(70);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.insert(myFirstNode,newNode);
		mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) 
        				 && mylinkedList.head.getNext().equals(newNode)
                         && mylinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
	}
	@Test
	public void given3NumbersShouldDeleteHeadOfLinkedList() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		mylinkedList.pop();
		mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(mySecondNode) 
        				 && mylinkedList.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
	}
	@Test
	public void given3NumbersShouldDeleteTailOfLinkedList() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		mylinkedList.popLast();
		mylinkedList.printMyNodes();
        boolean result = mylinkedList.head.equals(myFirstNode) 
        				 && mylinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
	}
	@Test
	public void given3NumbersShouldSerachElementInLinkedList() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		INode element=mylinkedList.search(myThirdNode);
		mylinkedList.printMyNodes();
        boolean result =element.getKey().equals(myThirdNode.getKey());
        Assert.assertTrue(result);
	}
	@Test
	public void given3NumbersShouldSerachElementAndThenAddOneElementAfterThatInLinkedList() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		KeyNode<Integer> myNewNode=new KeyNode<>(40);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		INode element=mylinkedList.search(mySecondNode);
		mylinkedList.insert(element, myNewNode);
		mylinkedList.printMyNodes();
        boolean result =mylinkedList.head.equals(myFirstNode) 
        				&& mylinkedList.head.getNext().equals(mySecondNode) 
        				&&mylinkedList.head.getNext().getNext().equals(myNewNode)
        				&& mylinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
	}
	@Test
	public void given3NumbersShouldAddElementAndDeleteAtAnyIndexInLinkedList() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		KeyNode<Integer> myNewNode=new KeyNode<>(40);
		mylinkedList.addElement(myFirstNode);
		mylinkedList.addElement(mySecondNode);
		mylinkedList.addElement(myThirdNode);
		INode element=mylinkedList.search(mySecondNode);
		mylinkedList.insert(element, myNewNode);
		mylinkedList.deleteAtIndex(myNewNode);
		mylinkedList.printMyNodes();
        boolean result =mylinkedList.head.equals(myFirstNode) 
        				&& mylinkedList.head.getNext().equals(mySecondNode) 
        				&& mylinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
	}
}
