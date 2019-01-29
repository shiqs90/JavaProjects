package com.poc.udemy;

/**
 * Hello world!
 *
 */
public class Methods 
{
    public static void main( String[] args )
    {  
    	boolean flag=true;
    	int dueDay=5;
    	int creditAmount=1000;
        int score=calculatorLoan(flag,dueDay, creditAmount);
        System.out.println(score);
    }
    public static int calculatorLoan(boolean flag,int dueDay,int creditAmount)
    {
    	if(flag)
    	{
    	int finalScore=dueDay+creditAmount;
    	return finalScore;
    	}

    	return -1;
    }
}

