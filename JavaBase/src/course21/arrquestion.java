package course21;

import java.util.Scanner;

public class arrquestion {

	public static void main(String[] args) {
		int[] typhoon = { 1, 1, 0, 0, 0, 1, 4, 5, 6, 4, 6, 1 };
		int[] quake = { 153, 127, 130, 109, 118, 184, 130, 103, 103, 104, 123, 141 };
		int[] rain = { 20, 58, 107, 87, 114, 187, 200, 59, 169, 441, 158, 94 };
		Scanner stdIn = new Scanner(System.in);
		System.out.println("閲覧する情報を選択してください。");
		System.out.println("1.地震件数、2.台風件数、3.降水量");
		int x = stdIn.nextInt();
		System.out.println("年別、月別かを選択してください。");
		int y = stdIn.nextInt();
		int z = 0;

		//条件
		if (x == 1 && y == 1) {
			for (int i = 0; i < quake.length; i++)
				z = z + quake[i];
			System.out.println("1年間で起きた地震は" + z + "件です。");
		} else if (x == 1 && y == 2) {
			System.out.println("閲覧したい月を入力してください。");
			int a = stdIn.nextInt();
			System.out.println(a + "月に起きた地震は" + quake[a - 1] + "件です。");
		} else if (x == 2 && y == 1) {
			for (int i = 0; i < typhoon.length; i++)
				z=z+ typhoon[i];
			System.out.println("1年間で起きた台風は" +z + "件です。");
		} else if (x == 2 && y == 2) {
			System.out.println("閲覧したい月を入力してください。");
			int b = stdIn.nextInt();
			System.out.println(b + "月に起きた台風は" + typhoon[b - 1] + "件です。");
		} else if (x == 3 && y == 1) {
			for (int i = 0; i < rain.length; i++)
				z = z + rain[i];
			System.out.println("1年間の降水量は" + z + "ｍｍです。");
		} else if (x == 3 && y == 2) {
			System.out.println("閲覧したい月を入力してください。");
			int c = stdIn.nextInt();
			System.out.println(c + "月の降水量は" + rain[c - 1] + "mmです。");

		}

	}

}
