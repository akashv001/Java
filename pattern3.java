package lecture1;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int cst=5;
		while(row<=n) {
			int nst=1;
			
			while(nst<=cst) {
				System.out.print("*");
				nst++;
			}
			System.out.println();
			row++;
			cst--;
	}

}
}