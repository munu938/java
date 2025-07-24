package day_4;

public class Butterfly {
public static void main(String[] args) {
	int i,j,n=7;
	for (i = 1; i <= n; i++) {
        for (j = 1; j <= 2 * n; j++) {
          
            // To print spaces
            if (j > i && j <= 2 * n - i) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
	for (i = n; i >= 1; i--) {
        for (j = 1; j <= 2 * n; j++) {
          
            // To print spaces
            if (j > i && j <= 2 * n - i) {
                System.out.print(" ");
            }
            
            // To print stars
            else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
}
