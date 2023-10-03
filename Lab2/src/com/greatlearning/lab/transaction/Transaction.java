package com.greatlearning.lab.transaction;

public class Transaction {

		public int targetCheck(int[] transactions, int target) {
			int sum = 0;
			
			for(int i=0; i<transactions.length-1; i++) {
				sum += transactions[i];// sum = sum +
				
				if (sum>=target) {
					return i;
				}
				
			}
			return -1;
		}
		
		public int targtCheckWithSub(int[] transactions, int target) {
			for (int i =0; i<transactions.length; i++) {
				target = target - transactions[i];// target = 20-21 =1-12 =-11;
				if(target<=0) {
					return i;
				}
			}
			return -1;
		}
}
