package com.poc.udemy;

public class AdvanceMethod {
	public static void main(String args[]){
		
		
		displayHighScorePosition("Akash",calculateHighScorePosition(1500));
		displayHighScorePosition("Shikha", calculateHighScorePosition(900));	
		displayHighScorePosition("Sunny bhaiya", calculateHighScorePosition(400));
		displayHighScorePosition("Rishu", calculateHighScorePosition(100));
	}
	
	public static void displayHighScorePosition(String name,int position){
		
		System.out.println(name+" managed to get in the position: "+position+" and high score table");
		
	}

	public static int calculateHighScorePosition(int score){
		int position=4;
		if(score>=1000) {
			position=1;
		}else if(score>=500 && score<1000) {
			position=2;
		}else if(score>=100 && score<500) {
			position=3;
		}
		return position;
	}
//		if(score>=1000) {
//			return 1;	
//		}else if(score>=500 && score<1000) {
//			return 2;
//		}else if (score>=100 && score<500) {
//			return 3;
//		}return 4;
}
