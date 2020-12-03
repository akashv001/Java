package lecture1;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int nst=5;
		while(row<=n) {
			int nsp=1;
			while(nsp<=row-1) {
			System.out.print(" ");
			nsp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println( );
			row++;
			nst--;
			
		}}}
