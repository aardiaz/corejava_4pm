package looping;

public class ForEachLoop {
	/*
	 * ------------- for Each loop -----------------------------
	 *   # use to read data from collection(array,list,set,map)
	 *   
	 *     #syntax :
	 *     
	 *         for(data_type  var : collection){
	 *           
	 *             //statements
	 *         }
	 */
	
	 public static void main(String[] args) {
		 
		 int[]  values = {65,7,8,9,6,54,35,6,78,65,65,43,56};
		 int s = 0;
				 
		 for(int x : values) {
			 
			 System.out.println(x);
			 s = s + x;
		 }
		 
		 System.out.println("Total  = "+s);
		
	}

}




