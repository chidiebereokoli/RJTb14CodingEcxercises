//This Java code will find the duplicates in an array if there is more than one duplicate
//[MORE THAN ONE DUPLICATE MEANS THAT THE NUMBER OF REPITIION FOR THE ELEMENT IS 3 OR MORE]

import java.util.*;

public class DuplicateFindingArrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2, 490,90,98,67,39,83, 490,90};

		Hashtable<Integer, Integer> results = new Hashtable<Integer, Integer>();	//Empty hashtable to be populated by duplicatefinder method
		Hashtable<Integer, Integer> finalresults = duplicatefinder(arr, results);
		System.out.println("The items in the array that have a frequency of more than 3 are as stated below;");
		System.out.println(finalresults);
		
	}

public static Hashtable<Integer, Integer> duplicatefinder(int arr[],Hashtable<Integer, Integer> finalresults){
		int i;
		int j;
		int size = arr.length;

		for (i=0; i<size; i++) {
			int number = arr[i];
			int frequency = 0;
		
				for (j = 0; j<size; j++) {
					if (number == arr[j]) {
						frequency++;
					}
				}
//the for loop above finds the frequency of each element in the array, while elements of the array that have
//3 or more duplicates,which have not been already inserted in the hash table will be inserted in the hashtable				
				if (frequency >= 3 &&  !finalresults.containsKey(arr[i])) {
					finalresults.put(arr[i], frequency);
				}
		}
		return finalresults;
		
	}
	
}
