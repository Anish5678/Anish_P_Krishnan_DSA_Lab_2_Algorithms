package com.greatlearning.lab.transaction;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		int [] transactions = new int[size];
		System.out.println("Enter the value of the transaction");
		for(int i=0; i<size; i++) {
			transactions[i]= sc.nextInt();
		}
		
		System.out.println("Enter the the number of targets need to be checked");
		int targetSize = sc.nextInt();
		for(int i=0; i<targetSize; i++) {
			System.out.println("Enter the target value");
			int target = sc.nextInt();
			int res = transaction.targtCheckWithSub(transactions, target);
			if(res > 0) {
				System.out.println("The target can be achieved after "+ (int) (res+1)+ "transactions");
				
			}else {
				System.out.println("The target cannot be achieved with given transactions");
			}
			
		}
		sc.close();
	}

}

