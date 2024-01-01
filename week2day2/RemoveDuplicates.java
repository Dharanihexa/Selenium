package week2day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates takeout = new RemoveDuplicates();
		takeout.dup();
	}
	
	public void dup() {
		
		int count=0;
		String Text= "We learn Java basics as part of java sessions in java week1";
	    String[] splittxt=Text.split(" ");
		
	for (int i = 0; i < splittxt.length; i++){
		for (int j = i+1; j < splittxt.length; j++) {
			
		if(splittxt[i].equalsIgnoreCase(splittxt[j])) {
			splittxt[j]="";
			count++;
		
		}
		}
		
	}
		if(count>0) {
			
			 for (String word : splittxt) {
				  if (!word.isEmpty()) {
	                    System.out.print(word + " ");
	            }
	        
	        }
			
	    }

	}

}
