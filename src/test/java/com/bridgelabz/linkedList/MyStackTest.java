package com.bridgelabz.linkedList;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

public class MyStackTest{
	MyStack myStack=new MyStack();
	@Test
	public void given3NumbersWhenAddedToStakeShouldHaveReturnTrue() {
		KeyNode<Integer> myFirstNode=new KeyNode<>(70);
		KeyNode<Integer> mySecondNode=new KeyNode<>(30);
		KeyNode<Integer> myThirdNode=new KeyNode<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		INode peak=myStack.peak();
		Assert.assertEquals(peak, myThirdNode);
	}
}
