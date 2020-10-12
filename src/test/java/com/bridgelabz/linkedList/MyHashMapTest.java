package com.bridgelabz.linkedList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyHashMapTest{
	@Test
	public void givenASentence_WhenWordsAreAddedToList_ShouldReturnWordOfFrequency() {
		String sentence="To be or not to be";
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value=myHashMap.get(word);
			if(value==null) value=1;
			else value=value+1;
			myHashMap.add(word, value);
		}
		int frequency=myHashMap.get("to");
		System.out.println(myHashMap);
		Assert.assertEquals(2,frequency);
	}
	@Test
	public void givenALongParagraph_WhenWordsAreAddedToList_ShouldReturnWordOfFrequency() {
		String sentence="Paranoids are not\r\n"
				+ "paranoid because they are paranoid but\r\n"
				+ "because they keep putting themselves\r\n"
				+ "deliberately into paranoid avoidable\r\n"
				+ "situations";
		MyHashMap<String,Integer> myHashMap=new MyHashMap<>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value=myHashMap.get(word);
			if(value==null) value=1;
			else value=value+1;
			myHashMap.add(word, value);
		}
		int frequency=myHashMap.get("they");
		System.out.println(myHashMap);
		Assert.assertEquals(2,frequency);
	}
}