import java.util.Date;
class Untitled {
	public static void main(String[] args) {
		//java.util.Date date = new java.util.Date();
		Date date = new Date();
		
		//System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		//System.out.println(date.toString());
		
		date.setTime(100000);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(1000000);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(10000000);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(100000000);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(1000000000);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(10000000000L);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
		date.setTime(100000000000L);
		System.out.println("The elapsed time since Jan 1,1970 is " + date.getTime() + " milliseconds");
		System.out.println(date.toString());
		
	}
}