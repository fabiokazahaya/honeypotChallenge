package com.honeypot;

public class Palindrome {

	public static void main(String[] args) {
		
		String a = "aaabbbb";
		String b = "cdefghmnopqrstuvw";
		String c = "bbaaabb";
		
		System.out.println(isPalidrome(a));
		System.out.println(isPalidrome(b));
		System.out.println(isPalidrome(c));
		
	}
	
	public static String isPalidrome(String s) {
		if (s.equalsIgnoreCase(String.valueOf(new StringBuilder(s).reverse()))) {
			return "YES";
		}else {
			return "NO";
		}
	}
}
