package com.aroha;

import java.util.Scanner;

public class WordCountOfString {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Give any Setence to count the words");
	String str=scanner.nextLine();
     int count = 0;
     boolean inWord = false;

     for (char ch : str.toCharArray()) {
         if (ch != ' ' && ch != '\t' && ch != '\n') {
             if (!inWord) {
                 count++;
                 inWord = true;
             }
         } else {
             inWord = false;
         }
     }
     System.out.println("Word count: " + count);
     String [] results = str.split(" ");
     count=0;
     for (String x : results)
    	 if (x.trim().length() !=0)
            count++;
     System.out.println("Word count: " + count);
}
}
