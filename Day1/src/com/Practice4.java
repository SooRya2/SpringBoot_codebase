package com;

public class Practice4 {
	
	 public static void main(String[] args) {
	        String input = "a1b2c3";
	        String output = reverseNumbers(input);
	        System.out.println(output); // Output: a3b2c1
	    }

	    private static String reverseNumbers(String input) {
	        StringBuilder result = new StringBuilder();
	        StringBuilder numbers = new StringBuilder();

	        // Collect all numbers from the input
	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                numbers.append(ch);
	            }
	        }

	        // Reverse the collected numbers
	        numbers.reverse();
	        int numberIndex = 0;

	        // Reconstruct the string with reversed numbers
	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                result.append(numbers.charAt(numberIndex++));
	            } else {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

}
