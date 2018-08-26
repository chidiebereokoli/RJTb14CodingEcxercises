package Homework_2nd_day;


import java.util.ArrayList;
import java.util.Iterator;


public class palindrome {

	static ArrayList<Integer> number_list = new ArrayList<>();
	int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ArrayList<Integer> first_list = number_generator(100000);
	    Iterator<Integer> its = first_list.iterator();
	    while (its.hasNext()){
	       int element = its.next();
	        palindrome_number_checker(element);
	    }

		
	}
	//function that takes a number n, and generates the number sequence from 0 to n, and stores in a list
	public static ArrayList<Integer> number_generator (int n){
	    for (int i=0;i<n;i++){
	        number_list.add(i);
	    }
	    return number_list;
	}
	
	//Function that identifies each digit in a numeral and stores the corresponding digit in an ArrayList
	public static ArrayList<Integer> digitizer (int number){
	ArrayList<Integer> digitized_number = new ArrayList<>();
	int big_number = number;
	    do{
	        int numeral = big_number%10;
	        big_number = big_number/10;
	        digitized_number.add(numeral);
	    }while(big_number>0);

	  return digitized_number;
	}
	
	//function to check if a number is a palindrome_number
	public static void palindrome_number_checker (int n){
	    if (n> -10 && n < 10)
	    { System.out.println(n); }
	    else{
	        ArrayList<Integer> digitized = digitizer(n);
	        int counter = 0;
	        int half_list_size = digitized.size()/2;
	      
	        for (int i = 0; i < half_list_size; i++){
	            if (digitized.get(i) == digitized.get(digitized.size() -1 -i))
	            counter++;
	        }
	        if (counter == half_list_size){System.out.println(n);}
	    }
	}
	
}


