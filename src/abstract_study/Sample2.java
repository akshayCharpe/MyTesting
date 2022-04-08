package abstract_study;

public abstract class Sample2 extends Sample1
{

	int otp=2504;
	public void captcha() {
		
		System.out.println("Please insert OTP that sent to your Mob no.");
		if(otp==2504)
		{
			System.out.println("OTP is right");
		}else
		{
			System.out.println("OTP is Wrong");
		}
		
	}
	
	public abstract void show();
	

	
	

}
