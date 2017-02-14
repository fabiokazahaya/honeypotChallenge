package com.honeypot;

import java.util.regex.Pattern;

public class StringCompression {

	public static void main(String args[]) {
		
		System.out.println(compress("aabbcghtnkkkk"));
		
	}
	
	public static String compress(String str) {
	    
		int count = 1;
	    StringBuilder sb = new StringBuilder();

	    for (int i = 1; i < str.length() - 1; i++) {
	        if (str.charAt(i) == str.charAt(i - 1)) {
	            count++;
	        } else {
	            sb.append(str.charAt(i - 1));
	            sb.append(count);
	            count = 1;
	        }
	    }

	    if (str.length() > 1) {
	        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
	            count++;
	        } else {
	            sb.append(str.charAt(str.length() - 2));
	            sb.append(count);
	            count = 1;
	        }
	        sb.append(str.charAt(str.length() - 1));
	        sb.append(count);
	    }
	    
	    Pattern.compile("1").matcher(sb).replaceAll("1");
	    return sb.toString().replaceAll("1", "");
	}
}



