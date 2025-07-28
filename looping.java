package day_4;

public class looping {
	public static void main(String[] args) {
		int k,l;
		 int n=5;
		
		for(k=n;k>=1;k--) {
			for(l=1; l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
