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
}
