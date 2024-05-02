package selection;

public class NestedTest {
	
	/*
	 * ------------------ Nested if-else ---------------
	 *   syntax :
	 *   
	 *        if(condition-1){
	 *        
	 *            if(condition-2){
	 *            
	 *                if(condition-3){
	 *                
	 *                   ...............
	 *                   ...........
	 *                   ...............
	 *                }else{
	 *                
	 *                }
	 *            
	 *            }else{
	 *            
	 *            }
	 *          
	 *        }else{
	 *        
	 *        }
	 */
	
	  public static void main(String[] args) {
		
		   String citizen = "nepali";
		   int age = 50;
		   boolean voterId = false;
		   
		   if(citizen.equals("nepali")) {
			   
			      if(age >= 18) {
			    	  
			    	     if(voterId) {
			    	    	 System.out.println("You can vote !!");
			    	     }else {
			    	    	 System.out.println("You dont hv voterId");
			    	     }
			    	  
			      }else {
			    	  System.out.println("you are under age !!");
			      }
			   
		   }else {
			   System.out.println("invalid citizenship !!");
		   }
		   
	}

}
