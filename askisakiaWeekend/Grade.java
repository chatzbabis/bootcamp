public class Grade{
	public static void main(String[] args){
		
			int x=Integer.parseInt(args[0]);
			
		
		if (x>=50)
			System.out.println("passed");
		else if (x<=100) 	
			System.out.println("non passed");
		
		if (x<50)
			System.out.println("F");
		else if (x<=59) 	
			System.out.println("E");
		else if (x<=69)
			System.out.println("D");
		else if (x<=79)
			System.out.println("C");
		else if (x<=89)	
			System.out.println("B");
		else if (x<=100)
			System.out.println("A");
		else 
			System.out.println("Invalid number");
		
			

}

}