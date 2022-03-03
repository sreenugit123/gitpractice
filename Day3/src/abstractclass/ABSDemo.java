package abstractclass;

abstract class Mobile
{
	abstract void setOs();
	void setOffers()
	{
		System.out.println("10 % Offers");
	}
}

class AppleMobiles extends Mobile
{

	@Override
	void setOs() {
		System.out.println("OS set as Apple");
	}

}	
 class SamsungMobiles extends Mobile
 {

	@Override
	void setOs() {
		System.out.println("OS Set as Android");
		
	}
	 
 }
 public class ABSDemo
 {
	 
 }
