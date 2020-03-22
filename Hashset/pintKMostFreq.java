import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
	int number;
	int frequency;

	public Pair(int number, int frequency) {
		this.number = number;
		this.frequency = frequency;
	}

	@Override
	public int compareTo(Pair o) {

		if (this.frequency == o.frequency) {
			return Integer.compare(o.number, this.number);
		}

		return Integer.compare(o.frequency, this.frequency);
	}
}

public class pintKMostFreq {

	/*
	 * Create a Map Integer vs Integer Store the element in this map as per their
	 * freq. Create a list Iterate over the keyset Of Map create the pair key vs
	 * val. add it in the arrayList;
	 * 
	 * Sort the list
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// get the number of integers from input
		int n = in.nextInt();

		// store all the input integers to the array
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}

		// get the value of k from input
		int k = in.nextInt();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}

		ArrayList<Pair> list = new ArrayList<Pair>();

		for (Integer key : map.keySet()) {
			int val = map.get(key);
			Pair p;
			p = new Pair(key, val);
			list.add(p);
		}

		// Sort the list in desc.
		Collections.sort(list);

		for (int i = 0; i < k; i++) {
			System.out.print(list.get(i).number + " ");
		}

	}

}

// import java.util.*;

// public class Source {
// 	public static void main(String args[]) {   
// 		     Scanner in = new Scanner(System.in);
//          int n = in.nextInt();
// 		   int array[] = new int[n];        
// 		   for (int i = 0; i < n; i++) 
// 		   {            
// 			   array[i] = in.nextInt();        
			
// 			}
// 		 int k = in.nextInt();        
// 		 HashMap<Integer,Integer> map=new HashMap<>();        
// 		 for(int i=0;i<n;i++)        
// 		 {   
			 
// 			  // if(!map.containsKey(array[i]))           
// 			   // {            
// 				   //     map.put(array[i],1);            
// 				// }           
// 				 // else{           
// 				//   map.put(array[i],map.get(array[i])+1);           
// 					 // }            
// 			 map.put(array[i],map.getOrDefault(array[i],0)+1); 
			
// 		 }

// 		  //freq map created  
// 		PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(            
// 			new Comparator<Map.Entry<Integer,Integer>>(){   
// 			public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b)
// 			{                    
// 				if(a.getValue()==b.getValue())                    
// 				{                        
// 					return b.getKey()-a.getKey();//in descending order                        
// 				}                    
// 				else                    
// 				{                        
// 					return b.getValue()-a.getValue();                     
// 				}                
// 			}            
// 		});//PQ Sorted According to the Values(in descending order)

// 		for(Map.Entry<Integer,Integer> entry: map.entrySet())            
// 		{               
// 			 pq.add(entry); 
// 		}
			
// 	for(int i = 0;i<k;i++)
// 	{
// 		System.out.print(pq.poll().getKey() + " ");
// 	}
// }
// }
// Print k Most Frequent Numbers
// You will be given an array of integers and an integer k. You have to print
// the k most frequently occurring integers in the given array of integers. The
// frequency of an integer in the array is nothing but the number of times it
// appeared in the array.

// Note:

// The integer with higher frequency should be printed first.

// If two integers have the same frequency, then the larger integer of the two
// should be printed first.

// Example:

// Input:
// 1 2 3 2 2 3 4 1 5
// 4

// Output:

// 2 3 1 5