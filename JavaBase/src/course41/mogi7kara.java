package course41;

import java.util.Scanner;

public class mogi7kara {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] numarr = { 10, 50, 30, 20, 40 };

		int karioki = 0;
		int karioki1 = 0;

		int x = stdIn.nextInt();
		int[] variable = new int[x];

		int[] numExArr = { 10, 50, 30, 20, 40 };

		for (int a : numarr) {
			if (numarr[1] == 50) {
				karioki = numarr[4];
				numarr[4] = numarr[1];
				numarr[1] = karioki;
			}
			System.out.println(a);
		}
		for (int a : numExArr) {
			if (a == 0) {
				karioki1 = numExArr[a];
			}

		}

	}

}
