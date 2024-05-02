package method;

public class ExampleMethod {

	public static void main(String[] args) {

		// sum();
		//printTable(765);
		int sum = getSumOf1To100();
		System.out.println("Sum of 100 nums = "+sum);
		
		 int sv = findSmallest(76565, 7676);
		 System.out.println("Smallest value = "+sv);
	}

	// 1.no return type with no arguments
	static void sum() {

		int a = 3443;
		int b = 5000;

		int c = a + b;
		System.out.println("Total = " + c);
	}

	// 2. no return type with arguments
	static void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}

	// 3. return type with no arguments
	static int getSumOf1To100() {

		int s = 0;

		for (int i = 1; i <= 100; i++) {
			s = s + i;
		}

		return s;
	}
	
	//4. return type with arguments
    static int findSmallest(int x, int y) {
    	 
    	   if(x < y) {
    		   return x;
    	   }
    	   
    	   return y;
     }
	
}



