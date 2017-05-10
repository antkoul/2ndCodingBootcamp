package MinAndPositions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		  Integer[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		  findMinAndPositions(array);
	}
	
	public static void findMinAndPositions(Integer[] array){		
		ArrayList<Integer> list     = new ArrayList<Integer>(Arrays.asList(array)); //Convert array[] to list
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		Object min = Collections.min(list);	//Find minimun value of the ArrayList list	
		for(int i=0;i<array.length;i++){
			if(list.get(i)==min){			//Each time you encounter the minimun value in list
				tempList.add(i);			//store its index to a second tempList
			}
		}
		
		System.out.println("Initial array: "+list.toString());
		System.out.println("Minimum value: "+min.toString());
		System.out.println("Indexes of minimum value: "+tempList.toString());
	}	
}		


