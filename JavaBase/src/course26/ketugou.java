package course26;

import java.util.Random;
import java.util.Scanner;

public class ketugou {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int gamecount = 0;
		int wincount = 0;
		int losecount = 0;
		int a = 1000;
		int s = 0;
		
		shojikin(a);
		int card1 = randam(s);
		int card2 = randam(s);
		System.out.println("カードは" + card1 + "です。次のカードはこれよりもHIGH？LOW？");
		System.out.println("HIGHと予想するなら「1」、LOWと予想するなら「2」");
		int b = stdIn.nextInt();
		System.out.println("現在のカード:【" + card1 + "】");
		System.out.println("次のカード:【" + card2 + "】でした。");
		String c = ransu(card1, card2, b);
		System.out.println(c);
		//勝負数、勝利数、敗北数に加算する。
		gamecount = gamecount + 1;
		if (c.equals("win!")) {
			wincount = wincount + 1;
			a=a*2;
		} else {
			losecount = losecount + 1;
			a=a/2;
		}
		double q = syouritu(gamecount, wincount);
		System.out.print("勝率:");
		System.out.println(q);
		dispResult(gamecount, wincount, losecount);
		String e = " ";
		String f = end(e);
		if (f.equals("END")) {
			System.out.println(f);
		}
	}

	//①
	static int shojikin(int x) {
		System.out.println("現在の所持金は" + x + "です。");
		return x;
	}

	//③
	static int randam(int y) {
		Random rnd = new Random();
		int num = rnd.nextInt(13) + 1;
		return num;
	}

	static String ransu(int x, int y, int z) {
		String kekka = " ";
		if (x < y && z == 1) {
			kekka = "win!";
		} else if (x < y && z == 2) {
			kekka = "LOSE";
		} else if (x > y && z == 1) {
			kekka = "LOSE";
		} else if (x > y && z == 2) {
			kekka = "win!";
		}
		return kekka;
	}

	static double syouritu(double x, double y) {
		double a = (y / x) * 100;
		return a;
	}

	static void dispResult(int x, int y, int z) {
		System.out.println("合計ゲーム数," + x + "ゲーム");
		System.out.println("勝利数," + y + "ゲーム");
		System.out.println("敗北数," + z + "ゲーム");
	}

	static String end(String z) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("やめる場合は「9999」を、続けたい場合はそれ以外を入力して下さい。");
		int d = stdIn.nextInt();
		if (d == 9999) {
			z = "END";
		} else {
			z = "CONT";
		}
		return z;
	}
}
