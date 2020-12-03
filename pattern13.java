package lecture1;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nr=2*n-1;
		int nst=1;
		while(row<=nr) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println( );
			if(row<=nr/2) {
				nst++;
			}
			else {
				nst--;
			}
			row++;
		}

	}

}
