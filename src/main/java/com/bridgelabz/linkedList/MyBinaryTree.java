package com.bridgelabz.linkedList;

public class MyBinaryTree<K extends Comparable<K>> {
	MyBinaryNode<K> root;
	//Add Node to BST
	public void add(K key) {
		this.root=addRecursively(root,key);
	}
	//Recursive Function to add Node in BST
	public MyBinaryNode<K> addRecursively(MyBinaryNode<K> current,K key){
		if(current==null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult=key.compareTo(current.key);
		if (compareResult == 0)
            return current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
	}
	//Method to find out Size of BST (In reference of Hight of Tree)
	public int getSize() {
        return this.getSizeRecursive(root);
    }
	//Recursive Function
	public int getSizeRecursive(MyBinaryNode<K> current) {
        return (current == null) ? 0 : 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
    }
	//Search Method for BST
	public boolean search(K key) {
        return searchRecursive(root, key) != null;
    }
	//Recursive Method for Searching Purpose in BST
	public MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
        if (current == null)
            return null;
        else if (current.key.compareTo(key) == 0)
            return current;
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.right, key);
        else
            return searchRecursive(current.left, key);
    }
}
