package practiceAll;

public class Im_class extends Abstract {

	public static void main(String[] args) 
	{

		Im_class im=new Im_class();
		
		im.ball();
		im.keil();
	}

	@Override
	public void ganga() {
		// TODO Auto-generated method stub
		System.out.println("Ganga");
	}

	@Override
	public void ball() {
		// TODO Auto-generated method stub
		System.out.println("ball");
	}

	@Override
	protected void jerry() {
		// TODO Auto-generated method stub
		System.out.println("jerry");
	}

	@Override
	void keil() {
		// TODO Auto-generated method stub
		System.out.println("keil");
	}

}
