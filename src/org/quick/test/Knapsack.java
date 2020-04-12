package org.quick.test;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knapsack ks = new Knapsack();
		int[] profits = {1, 6, 10, 16};
		int[] weights = {1, 2, 3, 5};
		int maxProfit = ks.solveKnapsack(profits, weights, 7);
		System.out.println("Total knapsack profit ---> " + maxProfit);
		maxProfit = ks.solveKnapsack(profits, weights, 6);
		System.out.println("Total knapsack profit ---> " + maxProfit);
	}

	private int solveKnapsack(int[] profits, int[] weights, int i) {
		// TODO Auto-generated method stub
		return knapsackRecursive(profits,weights, i, 0);
	}

	private int knapsackRecursive(int[] profit,int[] weight,int capacity,int currentIndex){

		if(capacity<=0 || currentIndex>=profit.length)
			return 0;
			
		int profit1 = 0;
		if(currentIndex==3){
			System.out.println(capacity);
		}
		if(weight[currentIndex]<=capacity){
			profit1 = profit[currentIndex] + knapsackRecursive(profit,weight,capacity-weight[currentIndex],currentIndex+1);
		}	
		
		int profit2 = knapsackRecursive(profit,weight,capacity,currentIndex+1);

		System.out.println("Current Index: "+currentIndex+" profit1: "+profit1+" profit2: "+profit2);
		
		return Math.max(profit1,profit2);


	}
	
	
	
}
