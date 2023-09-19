package course15;

import java.util.Random;
import java.util.Scanner;

public class 追加仕様 {
	public static void main(String[] args) {

		int a = 10000;
		while (a > 0 && a <= 50000) {
			System.out.println("現在の所持金は" + a + "円です。");
			System.out.println("掛け金を入力してください。");
			Scanner stdIn = new Scanner(System.in);
			int b = stdIn.nextInt();

			if (a < b) {
				b = a;
				System.out.println("所持金を超えたので掛け金は" + a + "円に変更しました");
			}
			a = a - b;
			System.out.println("残りの所持金は" + a + "円です");

			Random rnd = new Random();
			int c = rnd.nextInt(7) + 1;
			System.out.println("一つ目のサイコロの目は"+a+"でした");
			System.out.println("掛け金を変更しますか？"
					+ "1.はい 2.いいえ");
			int f=stdIn.nextInt();
			if(f==1) {
				a=a+b;
			System.out.println("掛け金を入力してください");
			
			
			int d = rnd.nextInt(7) + 1;
			int e = rnd.nextInt(7) + 1;
			System.out.println(c + "," + d + "," + e);

			//１１１	
			if (c + d + e == 3) {
				System.out.println("ピンゾロ");
				a = a + b * 5;
			} else
			//ゾロ目
			if (c == d && d == e && c != 1) {
				System.out.println("ゾロ目");
				a = a + b * 3;
			} else
			//四五六
			if (c == 4 && d == 5 && e == 6 || c == 4 && d == 6 && e == 5 || c == 5 && d == 4 && e == 6
					|| c == 5 && d == 6 && e == 4 || c == 6 && d == 5 && e == 4 || c == 6 && d == 4 && e == 5) {
				System.out.println("シゴロ");
				a = a + b * 2;
			} else
			//通常の目
			if (c == d && c != e && d != e && c != 7 || d == e && d != c && e != c && d != 7
					|| e == c && e != d && c != d && e != 7) {
				System.out.println("通常の目");
				a = a + b * 1;
			} else
			//ションベン
			if (c == 7 || e == 7 || d == 7) {
				System.out.println("ションベン");
				a = a - b;
			} else
			//一二三
			if (c == 1 && d == 2 && e == 3 || c == 1 && d == 3 && e == 2 || c == 2 && d == 1 && e == 3
					|| c == 2 && d == 3 && e == 1 || c == 3 && d == 2 && e == 1 || c == 3 && d == 1 && e == 2) {
				System.out.println("一二三");
				a = a - b * 2;
			} else {
				System.out.println("役無し");
				a = a - b;
			}
			System.out.println("現在" + a + "円です");

			if (a <= 0) {
				System.out.println("1050年地下行き");
			} else if (a >= 50000) {
				System.out.println("圧倒的勝利");
			}

		}
	}
}
}