package intrface_study;

public class Calling_intrface implements Interface2 {

	public static void main(String[] args) 
	{

		Calling_intrface ci=new Calling_intrface();
		
		ci.gold();
		ci.medal1();
		
		System.out.println("===================");
		
		ci.silver();
		ci.medal2();
		
	}

	@Override
	public void gold() {
		// TODO Auto-generated method stub
		System.out.println("This is gold");
		
	}

	@Override
	public void silver() {
		// TODO Auto-generated method stub
		System.out.println("This is silver");
		
	}

	@Override
	public void medal1() {
		// TODO Auto-generated method stub
		System.out.println("This is Medal 1.");
	}

	@Override
	public void medal2() {
		// TODO Auto-generated method stub
		System.out.println("This is Medal 2.");
	}

}
