package lecture1;

import java.util.Scanner;

public class pattern4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int csp=4;
		while(row<=n) {
			int nsp=1;
			while(nsp<=csp) {
				System.out.print(" ");
				nsp++;
			}
			int nst=1;
			while(nst<=row) {
				System.out.print("*");
				nst++;
			}
			System.out.println();
			row++;
			csp--;

	}

}}
