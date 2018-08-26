package Homework_2nd_day;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = factorial(6);
		System.out.println(ans);
	}
//Function for Finding the Factorial of a Number
	public static int factorial ( int n ){
	    int d =n;
	   int factorial=1;
	    do{
	        factorial = factorial*d*(d-1);
	        d =d-2;
	    }while(d>=2);
	return factorial;
	}
	
}
