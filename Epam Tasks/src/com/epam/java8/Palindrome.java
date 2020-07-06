package com.epam.java8;

import java.util.Arrays;
import java.util.List;
  public class Palindrome {
	    public static void main(String[] args) {

	        // This List is Created for Checking Purpose You Can Also Use Scanner for Taking Input From the User.
	        // Add all the inputs in an ArrayList then Typecast it into a List.

	        List<String> palindromes = Arrays.asList("LOL","MADAM","67","121","678");
	        List<String> result=CheckPalindromes.check(palindromes);

	        for (String item : result){
	            System.out.println(item);
	        }

	    }
	}

