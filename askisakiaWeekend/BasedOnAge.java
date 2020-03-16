public class BasedOnAge{
	public static void main(String [] args){

		int x=Integer.parseInt(args[0]);
		if (x<16)
   			 System.out.println("You cannot drive");
   		 else if (x<18) 
  			  System.out.println("Youcan drive but not vote");
  		  else if (x<22)
   			 System.out.println("You can vote but not drink");
    		else 
    			System.out.println("You can do anything");
    		}}