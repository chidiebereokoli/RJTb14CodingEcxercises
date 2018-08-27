
import java.util.List;
import java.util.ArrayList;

public class CommonElementFinderCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2, 490,90,98,67,39,83, 490,90};
		int arr2[] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39,8,4,11,56,27,82,209};

		List<Integer> result = commonelementfinder (arr1, arr2);
			System.out.println(result);
		}
	
	public static List<Integer> commonelementfinder (int arr1[], int arr2[]){
	int i;
	int j;
	
	int size1 = arr1.length;
	int size2 = arr2.length;
	
	List<Integer> finalresult = new ArrayList<Integer>();

	for (i=0;i<size1;i++) {
		
		int digit = arr1[i];
		for (j=0;j<size2;j++) {
			
			if (digit == arr2[j] && !Linear_search(finalresult.toArray(), digit)) {
				finalresult.add(digit);
			}
		}
	}
	return finalresult;
}
	//Function to perform the linear search of an element in an array
	public static boolean Linear_search (Object[] objects, int subject){
	int size = objects.length;
    for (int i=0;i< size; i++){
        if ( objects[i] == (Object)subject) {
            return true;}
    }
    return false;
}
}


//THE DISADVANTAGE OF THE CODE BELOW IS THAT IT PRINTS ZEROS AFTER PRINTING THE ELEMENTS COMMON TO BOTH ARRAYS
//TO OVERCOME THIS PROBLEM, WE USED A MORE ADVANCED CONTAINER ABOVE; A LIST, TO STORE AND PRINT THE RESULTS
/*public class CommonElementFinderCode {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,83,9,7,90,490,56,9,5,490,85,2,5,90,12,85,2, 83,90,43,24,2, 490,90,98,67,39,83, 490,90};
		int arr2[] = {9,5,490,85,2,5,90,12,85,43,24,98,67,39,8,4,11,56,27,82,209};
	
		int results [] = commonelementfinder (arr1, arr2);
		
		for (int i=0;i<results.length;i++) {
		
			System.out.println(results[i]);
			}
		}

public static int[] commonelementfinder (int arr1[], int arr2[]){
	int i;
	int j;
	
	int size1 = arr1.length;
	int size2 = arr2.length;
	int size;
		
	if (size1<size2) {						//Code to obtain the smaller of the sizes of the 2 arrays	
		size= size1;
	}  else size =size2;
	
	int[] finalresults = new int[size];

	int counter=0;
	
	for (i=0;i<size1;i++) {
		
		int digit = arr1[i];
		for (j=0;j<size2;j++) {
						
			if (digit == arr2[j] && !Linear_search(finalresults, digit)) {
				
				finalresults[counter]=digit;
				counter++;				
			}
		}
	}
	return finalresults;	
}
//Function to perform the linear search of an element in an array
public static boolean Linear_search (int arr[], int subject){
	int size =arr.length;
    for (int i=0;i< size; i++){
        if (arr[i] == subject) {
            return true;}
    }
    return false;
};

}
*/