package week2day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int Maxrange=10;
   System.out.print("odd number from 1-10 are:");

   for(int i=1;i<Maxrange;i++)
   {
	   if (i%2==1) {
		   System.out.print(i+",");
	   }
   }
	}

}
