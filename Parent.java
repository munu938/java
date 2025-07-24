package day_3;

import day.Basic_info;

public class Parent {
 // public everyone  can access of whole project
	//private only visible in only same class
	//default only in same package
	//protected 
	// when one class extends another class then that class becomes child of that another class child

	
	
public static void main(String[] args) {
		
		Basic_info obj = new Basic_info()  ;
		String name  = obj.class_name		 ;
		String pass  = obj.Safe_password ;
		
		
		System.out.println(name);
		
	}


}
