package Seki;

import java.util.Random;
import java.util.Scanner;

public class ketugou {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] seki = { { 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 },
				{ 31, 32, 33, 34, 35, 36 } };
		System.out.println("席替えするよ");
		System.out.println("席替えの方法を選んでね");
		System.out.println("A.完全ランダム方式 B.自席指定方式");
		String x = stdIn.next();
		Random rand = new Random();
		if (x.equals("A")) {
			for (int i = 0; i < seki.length; i++) {
				for (int j = 0; j < seki.length; j++) {
					System.out.print(seki[i][j] + ",");
				}
				System.out.println();
			}
			System.out.println("席替えできたよ");
			// int[] kako = new int[36];
			// for (int i2 = 0; i2 < kako.length; i2++) {
			// if (kako[i2] == r) {
			// r = rand.nextInt(36) + 1;
			// i2 = -1;
			// }
			// }
			//
			// for (int i2 = 0; i2 < kako.length; i2++) {
			// if(kako[i2] == 0) {
			// kako[i2] = r;
			// }
			// }
			for (int i = 0; i < seki.length; i++) {
				for (int j = 0; j < seki.length; j++) {
					int r = 1 + rand.nextInt(36);
					if (seki[i][j] != 0) {
						seki[i][j] = r;
						System.out.print(seki[i][j] + ",");
					}
				}
				System.out.println();
			}
		} else if (x.equals("B")) {
			//席を表示
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.print(seki[i][j] + ",");
				}
				System.out.println();
			}

			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					int q;
					System.out.println("左上から順に番号を入力してください");
					q = stdIn.nextInt();
					seki[i][j] = q;
			}
			}
		}

			//席を表示
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					System.out.print(seki[i][j] + ",");
				}
				System.out.println();
			}
			
			System.out.println("席を確定しますか？");
			 System.out.println("1,このまま確定する");
			 System.out.println("2、変更する");
			int x10 = stdIn.nextInt();
			//確定の場合の席表示
			if (x10 == 1) {
				System.out.println("席替えできたよ");
			}
			//変更の場合の席座標入力
			if (x10 == 2) {
				System.out.println("入れ替え元を入力してね[0][0]の左側");
				int x1 = stdIn.nextInt();
				System.out.println("入れ替え元を入力してね[0][0]の右側");
				int x2 = stdIn.nextInt();
				System.out.println("入れ替え先を入力してね[0][0]の左側");
				int z1 = stdIn.nextInt();
				System.out.println("入れ替え先を入力してね[0][0]の右側");
				int z2 = stdIn.nextInt();
				///入れ替え実行///
				int save = 0;
				save = seki[z1][z2];
				seki[z1][z2] = seki[x1][x2];
				seki[x1][x2] = save;
			}
	}

}
