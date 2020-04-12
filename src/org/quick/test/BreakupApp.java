package org.quick.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;


public class BreakupApp {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int noOflines = s.nextInt();                 // Reading input from STDIN
		//System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
		Map<Integer,Integer> map = new HashMap<>();
		
		/*while(true){
			
			s1+= s.next();
			if(s.next()=="\n")
				break;	
		}*/
		
		
		while(noOflines!=0){
			String line = s.next();
			line+=s.nextLine();
			System.out.println(line);
			Stream<String> stream = Stream.of(line.split(" "));
			//stream.forEach(System.out::println);
			stream = stream.filter((st)->{
				for (Character let :st.toCharArray() ) {
					if(Character.isDigit(let))
						return true;
				}
				return false;
			});
			//stream.forEach(System.out::println);
			if(line.charAt(0)=='G'){
				stream.forEach((word)->{
					if(map.containsKey(Integer.parseInt(word))){
						map.put(Integer.parseInt(word),map.get(Integer.parseInt(word))+2);
					}
					else{
						map.put(Integer.parseInt(word),2);
					}
				});
			}
			else{
				stream.forEach((word)->{
					if(map.containsKey(Integer.parseInt(word))){
						map.put(Integer.parseInt(word),map.get(Integer.parseInt(word))+1);
					}
					else{
						map.put(Integer.parseInt(word),1);
					}
				});
			}
			noOflines--;
		}
		Collection<Integer> waitage = map.values();
		List<Integer> maxWaitages = new ArrayList<Integer>();
		waitage.stream().sorted((n1,n2)->n2-n1).limit(2).forEach((n1)->maxWaitages.add(n1));
		
		if(maxWaitages.size()>1 && !maxWaitages.get(0).equals(maxWaitages.get(1))){
			System.out.println("Date");
		}
		else{
			System.out.println("Not a date");
		}

	}

}
