package looping;

public class JumpingTesst {
	/*
	 *  ------------- Jumping Statements ------------
	 *  a> break;       : exit from loop
	 *  b> continue;    : skip values
	 *  c> return;      : exit from method
	 */
	
	
	public static void main(String[] args) {
		
		for(int i=1; i<= 10; i++) {
			
			if(i == 5 || i == 8) {
				//break;
				//continue;
				return;
			}
			
			System.out.println(i);
		}
		
		System.out.println("end for loop");
	}
	
	
	/*
	 *   Q1> WAP to check a given number is prime or not.
	 *   Q2> WAP to print prime numbers between given range.
	 *   Q3> WAP to count prime numbers of given range.
	 *   Q4> WAP to reverse a given number(1234=>4321)
	 *   Q5> WAP to find sum of digits of given number(1234=> 1+2+3+4 = 10)
	 */
	

}
