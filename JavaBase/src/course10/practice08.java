package course10;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("xに数値を入力してください");
		int x = stdIn.nextInt();
		System.out.println("yに数値を入力してください");
		int y = stdIn.nextInt();
		System.out.println("zに数値を入力してください");
		int z = stdIn.nextInt();

		if (x > y && y > z) {
			System.out.println(x + "が一番大きい数値です");
			System.out.println(y + "が二番目に大きい数値です");
			System.out.println(z + "が三番目に大きい数値です");
		} else if (x > z && z > y) {
			System.out.println(x + "が一番大きい数値です");
			System.out.println(z + "が二番目に大きい数値です");
			System.out.println(y + "が三番目に大きい数値です");
		} else if (y > z && z > x) {
			System.out.println(y + "が一番大きい数値です");
			System.out.println(z + "が二番目に大きい数値です");
			System.out.println(x + "が三番目に大きい数値です");
		} else if (y > x && x > z) {
			System.out.println(y + "が一番大きい数値です");
			System.out.println(x + "が二番目に大きい数値です");
			System.out.println(z + "が三番目に大きい数値です");
		} else if (z > x && x > y) {
			System.out.println(z + "が一番大きい数値です");
			System.out.println(x + "が二番目に大きい数値です");
			System.out.println(y + "が三番目に大きい数値です");
		} else if (z > y && y > x) {
			System.out.println(z + "が一番大きい数値です");
			System.out.println(y + "が二番目に大きい数値です");
			System.out.println(x + "が三番目に大きい数値です");
		}
	}
}
