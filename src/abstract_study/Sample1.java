package abstract_study;

public abstract class Sample1 
{
	public Sample1()
	{
		System.out.println("Hiiiiiii......");
	}
	

	String name="Akshay charpe";
	String pass="Ak@2504";
	
	public void login()
	{
		if(name=="Akshay charpe")
		{
			if(pass=="Ak@2504")
			{
				System.out.println("Welcome to Homepage");
			}
			else {
				System.out.println("Wrong password");
			}
		}else {
			System.out.println("Wrong username");
		}
	}
	
	public abstract void captcha();
	
	protected abstract void rose();
}
