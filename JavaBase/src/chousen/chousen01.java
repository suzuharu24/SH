package chousen;

import java.util.Scanner;

public class chousen01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("あなたが考えている項目の番号を入力してください");
		System.out.println("性別を選択してください。" + "1.男性　２.女性");
		int a = stdIn.nextInt();
		System.out.println("職業を選択してください。" + "1.エンジニア　2.営業職");
		int b = stdIn.nextInt();
		System.out.println("当てはまるものを選択してください。"
				+ "1.魚が好き　2.魚が嫌い　3.魚は嫌いだが、肉は好き");
		int c = stdIn.nextInt();
		System.out.println("当てはまるものを選択してください。"
				+ "1.夏より冬が好き　2.冬より夏が好き");
		int d = stdIn.nextInt();
		System.out.println("当てはまるものを選択してください。"
				+ "1.猫派　2.犬派");
		int e = stdIn.nextInt();

		if (a == 1 && b == 2 && c == 2 && d == 1 && e == 1) {
			System.out.println("あなたが考えているのはAさんです。");
		}
		{
			if (a == 2 && b == 1 && c == 1 && d == 1 && e == 1)
				System.out.println("あなたが考えているのはBさんです。");
		}
		{
			if (a == 1 && b == 1 && c == 3 && d == 2 && e == 1)
				System.out.println("あなたが考えているのはCさんです。");
		}
		{
			if (a == 2 && b == 2 && c == 1 && d == 1 && e == 2) {
				System.out.println("あなたが考えているのはDさんです。");
			}
			if (a == 1 && b == 2 && c == 1 && d == 1 && e == 2) {
				System.out.println("あなたが考えているのはEさんです。");
			}
			if (a == 2 & b == 1 & c == 3 & d == 2 & e == 2) {
				System.out.println("あなたが考えているのはFさんです。");
			}
		}
	}
}
