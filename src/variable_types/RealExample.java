package variable_types;

public class RealExample {

	String name;
	long mob;
	char grade;
	static String id;
	String sub;
	
	
	public void student_info()
	{
	
		System.out.println("Student name is "+name);
		System.out.println("Student mob. no. "+mob);
		System.out.println("Student Grade is "+grade);
		System.out.println("Id of student is "+id+"\n");
		
	}
	
	public void teacher_info()
	{
		System.out.println("Teacher name is "+name);
		System.out.println("Teacher id is "+id);
		System.out.println("Teacher subject is "+sub);
	}
	
}
