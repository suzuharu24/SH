package Seki;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] seki =  { { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 },
				             { 0, 0, 0, 0, 0, 0 } };

		//席を表示
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				int x;
				System.out.println("左上から順に番号を入力してください");
				x = stdIn.nextInt();
				seki[i][j] = x;
			}
		}

		//席を表示
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(seki[i][j]+",");
			}
			System.out.println();
		}

	}

}