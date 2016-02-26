import java.util.Arrays;
import java.util.Scanner;

public class NextNBC {

	public static void main(String[] args) {
	 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an nbc number:");
		String number = keyboard.nextLine(); // Read 1st line
		String[] numbers = number.split(""); // Split based on space
		
		int[] bits = new int[numbers.length];
		
		for(int i=0;i<numbers.length;i++)	{
    		bits[i] = Integer.parseInt(numbers[i]);
		}

	   	NBC myNbc = new NBC(bits);
	   	myNbc.nextNBC(myNbc);
	   	
	   	System.out.println("Next nbc number is:");
	   	myNbc.print(myNbc);
	}

	public static class NBC {

		public int[] bits;

		public NBC(int[] bits) {
			this.bits = bits;
		}

		public NBC nextNBC(NBC nbc) { 
	        for(int i = bits.length - 1; i >=0; i--) {
	        	if(this.bits[i] == 1) {
	        		this.bits[i] = 0;
	        	}
	        	else if(this.bits[i] == 0) {
	        		this.bits[i] = 1;
	        		break;
	        	}
	        }
	        return nbc;
	    }
	    public void print(NBC nbc) {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < bits.length; i++) {
   				strBuilder.append(Integer.toString(bits[i]));
			}
			System.out.println(strBuilder.toString());
	    }
	}
}