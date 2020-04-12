package org.quick.test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StartingWithStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,1,13,90,16,2,0,0,-1};
		
		IntStream.of(arr).min().ifPresent(min->System.out.println(min));
		IntStream.of(arr).min().ifPresent(System.out::print);
		
		IntSummaryStatistics intSummaryStatistics = IntStream.of(arr).summaryStatistics();
		
		System.out.println(intSummaryStatistics.getMax());
		
		IntStream.of(arr).distinct().sorted().limit(3).forEach(System.out::println);;
		IntStream.of(arr).filter(num -> num%2==0).forEach(System.out::println);
		
		List<Fan> lists = new ArrayList<Fan>();
		
		lists.stream().sorted((f1,f2)->{
			if(f1.quotient != f2.quotient){
				return f2.quotient - f1.quotient;
			}
			else{
				return f2.name.compareTo(f1.name);
			}
		}).limit(2).forEach(System.out::println);
		
		
		
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	public static void test() throws Exception{
		try{
			System.out.println("try");
			return;
		}
		
		finally {
			System.out.println("finally");
		}
	}

}
