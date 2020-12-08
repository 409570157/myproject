package com.yuni;

import java.util.Random;

public class Guess {

	public static void main(String[] args) {
		
		Random r = new Random();
		char[] secret = new char[4];
		for(int i=0;i<4;i++) {
			char a = (char)(r.nextInt(10)+48);
			
		Boolean d = false;
		for(int c=0;c<i;c++) {
			if (secret[c] == a ) {
				
				d = true;
				break;
			}}if(d) {
				i--;
			}else {
				System.out.println(a);
				secret[i]= a;
			
		}	
	}

}}
