package day_5;
import java.util.Scanner;
// to import scanner which takes int,double etc.
public class Calculator {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        // to let the user put the value
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();
	        
	        System.out.print("Enter operation (+, -, *, /, %): ");
	        char operation = scanner.next().charAt(0);
	        //helps to declare and take characters
	        // Perform working
	        int result = 0;
	        //initialising result as 0 and a integer type value.
	        switch (operation) {
	            case '+' :
	                result = a + b;
	                break;
	                
	            case '-' :
	                result = a- b;
	                break;
	            case '*' :
	                result = a * b;
	                break;
	            case '/':
	                if (b != 0) {
	                    result = a / b;
	                } else {
	                    System.out.println("impossible");
	                    return;
	                }
	                break;
	            case '%' :
	                if (b != 0) {
	                    result = a % b;
	                } else {
	                    System.out.println("Error");
	                  return;
	                }
	                break;
	                //if b is a value 0.
	            default:
	                System.out.println("Invalid operation");
	                return;
	        }// if other then these 5 operation signs are used
	        
	        // Print the result
	        System.out.println("Result: " + result);
	        
	        scanner.close();
	    
	}

}
