package Seki;

import java.util.Random;
import java.util.Scanner;

public class barabara {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] seki = new int[6][6];
		int[] kako = new int[36];

		//乱数を出す。
		Random rnd = new Random();

		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < 6; b++) {
				//「x」が今出た乱数
				int x = rnd.nextInt(36) + 1;


				//過去に出た乱数を記憶する配列分ループ
				for (int i = 0; i < kako.length; i++) {
					if (kako[i] == x) {
						//乱数を取り直す。
						x = rnd.nextInt(36) + 1;
						i = -1;
					}
				}

				//ここにたどり着くころには、
				//「x」は過去に出ていない値になっている。
				System.out.println(x);

				//使用済み配列に「x」を入れる。
				for (int i = 0; i < kako.length; i++) {
					if (kako[i] == 0) {
						kako[i] = x;
					}
				}

				System.out.println(kako[b]);
				//座席表の配列に「x」を入れる。
//				seki[a][b] = x;
				
			}
//		}
	}
}
