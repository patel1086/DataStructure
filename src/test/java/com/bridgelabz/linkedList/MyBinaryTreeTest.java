package com.bridgelabz.linkedList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyBinaryTreeTest {
	MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
	@Test
	public void given3NumbersWhenAddedToBinarySearchTreeShouldReturnSizeIsTrue() {
		binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int sizeOfBST = binaryTree.getSize();
        Assert.assertEquals(3, sizeOfBST);
	}
	@Test
    public void givenManyNumbers_whenAddedToBST_shouldReturnHeightOfTree() {
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
        int sizeOfBST = binaryTree.getSize();
        Assert.assertEquals(13, sizeOfBST);
    }
}
