package com;

import java.util.Scanner;

/*
Given an integer x, return true if x is a 
palindrome,and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/
public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = scanner.nextInt();

		 if (isPalindrome(x)) {
	            System.out.println(x + " is a Palindrome number.");
	        } else {
	            System.out.println(x + " is not a Palindrome number.");
	        }
	}

	public static boolean isPalindrome(int x) {
        int reverse=0;
        int temp=x;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        return reverse==x ;
       
    }
}
