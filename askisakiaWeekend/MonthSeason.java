public class MonthSeason{
	
	public static void main(String [] args){
		String x=args[0];
		if (x.equals("Jenaury") || x.equals("febraury") || x.equals("December"))
		System.out.println("Winter");
		else if (x.equals("March") || x.equals("April") || x.equals("May"))
		System.out.println("Spring");
		else if (x.equals("June") || x.equals("July") || x.equals("August"))
		System.out.println("Summer");
		else if (x.equals("September") || x.equals("Octomber") || x.equals("November"))
		System.out.println("Automn");
		else
		System.out.println("not");
	}}