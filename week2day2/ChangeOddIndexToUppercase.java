package week2day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		ChangeOddIndexToUppercase upper = new ChangeOddIndexToUppercase();
		upper.upperCase();

	}
	
	
	public void upperCase() {
		
		String change ="changeme";
		char[] uppercase= change.toCharArray();
		for (int i = 0; i < uppercase.length; i++) 	
		
		{
			
			if(i%2 == 1) {
								
				 uppercase[i] = Character.toUpperCase(uppercase[i]);
			}
		}
				String modifiedString = new String(uppercase);
		        System.out.println(modifiedString);
			}
			

	}

