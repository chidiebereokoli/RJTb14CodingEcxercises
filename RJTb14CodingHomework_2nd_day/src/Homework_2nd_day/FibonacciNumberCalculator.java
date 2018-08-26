package Homework_2nd_day;

public class FibonacciNumberCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    for (int i =0; i<30 ; i++){
	        
	        System.out.println(fibonacci(i)+ " ");
	    }
	}

	//Function for calculating the fibonacci numbers from 0 to any given n
	public static int fibonacci ( int n ){
		 if (n<= 1) {return n;}
		 else {return fibonacci (n - 1) + fibonacci (n-2);}
		}
	
}
