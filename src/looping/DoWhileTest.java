package looping;

public class DoWhileTest {
	/*
	 * ----------- do-while ---------------
	 * syntax :
	 * 
	 *     do{
	 *     
	 *        //statements
	 *     
	 *     }while(condition);
	 */
	
	public static void main(String[] args) {
		
		/*
		 *    8 x 1  = 8
		 *    8 x 2  = 16
		 *    .........
		 *    ..........
		 *    8 x 10 = 80
		 */
		
		   
		  int n = 433;
		  int i = 1;
		  
		  do {
			  
			  System.out.println(n+" x "+i+" = "+(n*i));
			  
			  i++;
		  }while(i <= 10);
		
	}

}
