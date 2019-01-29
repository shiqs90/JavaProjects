package com.poc.udemy;


public class CodingExercise1 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(-1);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}else {
			int megaBytes=kiloBytes/1024;
			int remKiloBytes=kiloBytes % 1024;
			System.out.println(kiloBytes+" KB = "+megaBytes+" MB "+"and "+remKiloBytes+" KB");
		}
		
	}
}
