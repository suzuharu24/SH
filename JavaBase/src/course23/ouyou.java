package course23;

import java.util.Scanner;

public class ouyou {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("どっちを行いますか？");
		System.out.println("1,加算　2,減算　3,乗算　4,除算");
		int a = stdIn.nextInt();
		System.out.println("計算したい数を入力してください。");
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		if (a == 1) {
			tasu(b, c);
		} else if (a == 2) {
			hiku(b, c);
		}else if(a==3) {
			kake(b,c);
		}else if(a==4);{
			waru(b,c);
		}
	}

	static void tasu(int x, int y) {
		System.out.println(x + y);
	}

	static void hiku(int x, int y) {
		System.out.println(x - y);
	}
	static void kake(int x,int y) {
		System.out.println(x*y);
	}
	static void waru(int x,int y) {
		System.out.println(x%y);
	}

}
