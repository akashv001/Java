package lecture1;

import java.util.Scanner;

public class patern21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nsp=2*n-3;
		int nst=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
			System.out.print("*");
			cst++;
		}
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cs=1;
			while(cs<=nst) {
			System.out.print("*");
			cs++;
			
	}
			System.out.println( );
			row=row+1;
			nst=nst+1;
			
			nsp=nsp-2;

}
}}