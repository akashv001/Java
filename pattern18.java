package lecture1;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
	    int nsp=1;
		int nst=n/2;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print(" ");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print("*");
				csp++;
			}
//			int cs=1;
//			while(cs<=nst) {
//				System.out.print(" ");
//				cs++;
//			}
			System.out.println( );
			if(row<=n/2) {
				nsp=nsp+2;
				nst--;
			}
			else {
				nsp=nsp-2;
				nst++;
			}
			
			row++;

	}

}
}