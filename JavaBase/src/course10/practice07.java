package course10;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください。");

		int x = stdIn.nextInt();
		int a = x % 2;

		if (a == 0) {
			System.out.println("入力した数値は偶数です。");
		} else {
			System.out.println("入力した数値は奇数です。");
		}

	}

}
