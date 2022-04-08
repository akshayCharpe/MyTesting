package generalization;

public class Emp_2 implements Company
{

	@Override
	public void timing() {
		// TODO Auto-generated method stub
		System.out.println("Timing is 3-11");
		
	}

	@Override
	public void rules() {
		// TODO Auto-generated method stub
		System.out.println("2nd Shift");
		
	}

	@Override
	public void lunch() {
		// TODO Auto-generated method stub
		System.out.println("Lunch available");
		
	}
	
	public void background()
	{
		System.out.println("Mechanical Engg.");
	}

	
}
