package com.bridgelabz.linkedList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedHashMapTest {
	@Test
    public void givenALongParagraph_WhenWordsAreAddedToList_ShouldReturnWordOfFrequency() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        int frequency = myLinkedHashMap.get("they");
        Assert.assertEquals(2, frequency);
	}
	@Test
    public void givenALongParagraph_WhenWordsAreAddedToList_ThenDeleteAnOccuranceOfWord_ShouldRetur() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myLinkedHashMap.get(word);
            if (value == null) value = 1;
            else value = value + 1;
            myLinkedHashMap.add(word, value);
        }
        String deletedWord = myLinkedHashMap.delete("avoidable");
        Assert.assertEquals("avoidable", deletedWord);
	}
}
