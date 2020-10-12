package com.bridgelabz.linkedList;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest{
	MyQueue myQueue=new MyQueue();
	@Test
	public void given3NumbersWhenAddedToQueueShouldHaveReturnTrue() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		myQueue.queue(myFirstNode);
		myQueue.queue(mySecondNode);
		myQueue.queue(myThirdNode);
		INode peak=myQueue.peak();
		myQueue.printQueue();
		Assert.assertEquals(peak, myFirstNode);
	}
	@Test
	public void given3NumbersWhenDeletePeakValueOfQueueShouldHaveReturnTrue() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(56);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(70);
		myQueue.queue(myFirstNode);
		myQueue.queue(mySecondNode);
		myQueue.queue(myThirdNode);
		INode deQueue=myQueue.dequeue();
		myQueue.printQueue();
		Assert.assertEquals(deQueue, myFirstNode);
	}
	
}