import java.util.Random;

public class exercise2 {
	//Ex.2 - generates 25 random int values. For each value, 
		//use an if-else statement to classify it as greater than,
		//less than, or equal to a second randomly generated value.
		/*process: write a method to compare two numbers and return string；
		 * in the main, generate 2 random numbers, compare the numbers and return 
		 * a statement by calling the method*/
	public static String result;
	
	public static String compare(int m, int n){
			if (m>n) {
				result = Integer.toString(m)+" is greater than "+Integer.toString(n); 
				return result;
			}
				
			else if(m<n){
				result = Integer.toString(m)+" is less than "+Integer.toString(n);
				return result;
			}
				
			else 
				return "They are the same!";
	}
	
	public static void main (String[] args){
		Random rand = new Random();
		for (int i=0;i<25;i++){
			int x= rand.nextInt(2000);
			int y = rand.nextInt(2000);
			String conclusion = compare(x,y);
			System.out.println(conclusion);
		}

	}
	
	
	
}

