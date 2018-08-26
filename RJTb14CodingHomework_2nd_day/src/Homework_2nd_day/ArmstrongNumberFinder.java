package Homework_2nd_day;

import java.util.ArrayList;

public class ArmstrongNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    for(int i=0; i<1000; i++){
	        armstrong_number_finder(i);
	    }
	}

	//Function that accepts an integer and only prints this integer if the integer is an armstrong number
	public static void armstrong_number_finder (int n){
	    ArrayList<Integer> number_container = new ArrayList<>();
	    int number_passed = n;
	    do{
	        int digit = number_passed%10;
	        int number_saved = number_passed/10;
	        number_container.add(digit);
	        number_passed = number_saved;
	    }while (number_passed>0);
	    int number = 0; // Number to check whether the subject number is an armstrong number
	    int size_number = number_container.size();
	    for (int i=0; i<size_number; i++){
	        number = number + (int)(Math.pow(number_container.get(i),size_number));
	    }
	    if (n == number) {
	        System.out.println(n + " ");
	    }
	}
	
}
