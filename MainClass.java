package day_3;


public class MainClass {
        
	String name;
	int marks;
	
	
	public static void main(String[] args) {
		
		
		Student s1  = new Student()  ;
		
		s1.name=  "rumi" ;
		s1.address = "chennai" ;
		s1.marks  = 92  ;
		
		s1.displayStudentData();
		s1.study();
		
		System.out.println("-----*------*-----*-----*------*-------*-------*-----*----");
		
		Student s2  = new Student()  ;
		
		s2.name=  "jinu" ;
		s2.address = "goa" ;
		s2.marks  = 92  ;
		
		s2.displayStudentData();
		s2.study();
		System.out.println("-----*------*-----*-----*------*-------*-------*-----*----");
		
		
Student s3  = new Student()  ;
		
		s3.name=  "jinu" ;
		s3.address = "goa" ;
		s3.marks  = 92  ;
		
		s3.displayStudentData();
		s3.study();
		System.out.println("-----*------*-----*-----*------*-------*-------*-----*----");
		
Student s4  = new Student()  ;
		
		s4.name=  "ryan" ;
		s4.address = "switz" ;
		s4.marks  = 78;
		
		s4.displayStudentData();
		s4.study();
		
		System.out.println("-----*------*-----*-----*------*-------*-------*-----*----");
		
		
Student s5 = new Student()  ;
		
		s5.name=  "mera" ;
		s5.address = "delhi" ;
		s5.marks  = 86  ;
		
		s5.displayStudentData();
		s5.study();
	}
}