package lecture1;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}}}