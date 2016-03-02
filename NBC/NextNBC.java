import java.util.*;

public class NextNBC {

	public static void main(String[] args) {
	 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an nbc number:");
		String number = keyboard.nextLine(); // Read 1st line
		String[] numbers = number.split(""); // Split based on space
		
		List<Integer> bits = new ArrayList<>();
		
		for(int i = 0; i < numbers.length; i++)	{
    		bits.add(i, Integer.parseInt(numbers[i]));
		}

	   	NBC myNbc = new NBC(bits);

	   	myNbc.nextNBC(myNbc);
	   	
	   	System.out.println("Next nbc number is:");
	   	myNbc.print(myNbc);
	}

	public static class NBC {

		public List<Integer> bitsList = new ArrayList<>();

		public NBC(List<Integer> bitsList) {
			this.bitsList = bitsList;
		}

		public NBC nextNBC(NBC nbc) {
			this.bitsList.add(0, 0);
	        for(int i = bitsList.size() - 1; i >= 0; i--) {
	        	if(bitsList.get(i) == 1) {
	        		bitsList.set(i, 0);
	        	}
	        	else if(bitsList.get(i) == 0) {
	        		bitsList.set(i, 1);
	        		break;
	        	}
	        }
	        if(bitsList.get(0) == 0) {
	        	bitsList.remove(0);
	        }
	        return nbc;
	    }
	    
	    public void print(NBC nbc) {
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < bitsList.size(); i++) {
   				strBuilder.append(Integer.toString(bitsList.get(i)));
			}
			System.out.println(strBuilder.toString());
	    }
	}
}