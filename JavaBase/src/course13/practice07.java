package course13;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("数値を入力してください。");
		
		int y = stdIn.nextInt();
		
		for (int i = 1; i < y; i++) {
			System.out.println(i);
			
			int x = i % 2;
			
			if (x == 0) {
				System.out.println("偶数");
			} else if(x == 1) {
				System.out.println("奇数");
			}
			if (i >= 100) {
				System.out.println("どれだけまわすの？？？");
			}

		}

	}

}
