import java.util.*;
public class tuitionTotal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the tuition for the first year: ");
		double initialTuition = input.nextDouble();
		System.out.println("Enter the rate at which the tuition increases each year: ");
		final double rate = input.nextDouble(); //Percentage increase each year
		System.out.println("The total cost of tuition for four years:");
		for (int i = 0; i<4; i++){
			double totalTuition = 0;
			totalTuition = initialTuition*Math.pow((rate/100),4.0) + initialTuition;
			System.out.printf("%2d years from now: $%2.5f\n", (i+1), totalTuition);	
			initialTuition = initialTuition * (rate/100) + initialTuition;
		}
		
		
		
		
		
		
		 
		 
		

	}

}
