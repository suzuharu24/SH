package course06;

import java.util.Scanner;

public class ouyou01 {

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		System.out.println("xの値を入力してください");
		double x = stdIn.nextDouble();

		//xの部分は変数名なのでint等は入れない
		if (x >= 10) {
			System.out.println("10以上");
		} else {
			System.out.println("小さい");
		}

	}

}
