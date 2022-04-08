package variable_types;


public class RealExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====================");

    	RealExample Akshay=new RealExample();
    	
    	Akshay.name="Akshay charpe";
    	Akshay.mob=8475339543l;
    	Akshay.grade='A';
    	RealExample.id="ST1290";
    	
    	RealExample Suresh=new RealExample();
    	
    	Suresh.name="Suresh chavan";
    	Suresh.mob=7645783965l;
    	Suresh.grade='c';
    	RealExample.id="ST1020";
    	
    	Akshay.student_info();
        Suresh.student_info();
        
        System.out.println("=====================");
        
        RealExample Teacher=new RealExample();
        
        RealExample.id="TC213";
        Teacher.name="Yogendra";
        Teacher.sub="Software Testing";
        
        Teacher.teacher_info();
        
        System.out.println("======================");
    	
    	
	}

}
