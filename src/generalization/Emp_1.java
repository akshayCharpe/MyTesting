package generalization;

public class Emp_1 implements Company {

	@Override
	public void timing() {
		// TODO Auto-generated method stub
		System.out.println("Timing is 7-3");
		
	}

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		System.out.println("you have 1st shift.");
	}

	@Override
	public void lunch() {
		// TODO Auto-generated method stub
		System.out.println("No Lunch");
	}
	
	public void profile()
	{
		System.out.println("Software Engg.");
	}

}
