package lecture1;

import java.util.Scanner;

public class pattern0 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int row=1;row<=n;row++) {
			System.out.print("*");
			System.out.print("\n");
		}
	}

}
