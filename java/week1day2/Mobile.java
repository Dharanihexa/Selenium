package week1day2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Mobile Communication = new Mobile();
 System.out.println("This is My mobile");
 Communication.makeCall("iphone",171.0f);
 Communication.sendMsg(true,107900);
	}
 public void makeCall(String mobileModel, float mobileWeight)
 {
		 System.out.println("MobileModel : " +mobileModel);
		 System.out.println("MobileWeight : " +mobileWeight);
 }
 public void sendMsg(boolean isFullCharged,int mobileCost)
 {
	 System.out.println("Battery : "+isFullCharged);
	 System.out.println("Cost : "+mobileCost);
 }
}
