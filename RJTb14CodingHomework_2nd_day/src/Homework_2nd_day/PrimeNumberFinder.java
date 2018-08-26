package Homework_2nd_day;

public class PrimeNumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime_number_finder(100);
	}

//Function that prints the prime numbers from 0 to n	
	
	public static void prime_number_finder (int n){
	    for(int i=2; i<=n ; i++){
	                boolean c = true;
	                for (int j = 2; j < i; j++) {
	                    if ((i % j) == 0) {
	                        c = false;
	                        break;
	                    }
	                }
	                if(c)
	                   System.out.print(i+" ");
	            }
	        }
	
//Another Function that prints the prime numbers from 0 to n
/*	public static void prime_number_finder (int n){
	    for(int i=0; i<=n ; i++){
	        if (i>0 && i<3){
	            if(i%2 == 0) {
	            	System.out.print(i+" ");
	            }
	        }
	        else if (i>=3 && i<=5){
	            if(i%2 != 0) {
	            	System.out.print(i+" ");
	            }
	        }
	        else{
	            if (i%2 == 0 || i%3==0){
	                continue;
	            }
	            else {
	                boolean c = true;
	                for (int j = 5; j < i/2; j += 2) {
	                    if ((i % j) == 0) {
	                        c = false;
	                        break;
	                    }
	                }
	                if(c)
	                	System.out.print(i+" ");
	            }
	        }
	    }
	 }*/

}
