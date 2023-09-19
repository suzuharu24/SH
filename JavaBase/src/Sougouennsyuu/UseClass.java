package Sougouennsyuu;

import java.util.Scanner;

public class UseClass {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		Trainer tr = new Trainer("");
		System.out.println("トレーナーの名前を入力してください");
		tr.name = stdIn.next();

		xloop: while (true) {

			System.out.println("選択してください");
			System.out.println("1.捕獲,2.図鑑を見る,3.バトル,99.終了");
			int x = stdIn.nextInt();

			if (x == 1) {//バトル
				System.out.println("捕獲したいポケモンの名前を入力してください。");
				String name = stdIn.next();

				System.out.println("ポケモンのタイプを選択してください");
				String type = stdIn.next();

				//String type = "火";
				//System.out.println(type);
				System.out.println();

				System.out.println("戦闘力を入力してください");
				int power = stdIn.nextInt();

				//int power=1;
				//System.out.println(1);
				System.out.println();

				System.out.println("捕獲難易度を入力してください");
				int difficult = stdIn.nextInt();

				//int difficult = 0;
				//System.out.println(difficult);
				System.out.println();

				Pocketon pocke = new Pocketon(name, type, power, difficult);
				tr.capture(pocke);
				tr.display();

				continue;

			} else if (x == 2) {//図鑑
				tr.display();

				continue;

			} else if (x == 3) {
				Battle bt = new Battle();
				System.out.println("バトルさせたい１体目のポケモンの名前を入力してください");
				String A1 = stdIn.next();

				System.out.println("バトルさせたい２体目のポケモンの名前を入力してください");
				String A2 = stdIn.next();

				int b1 = 0;
				for (b1 = 0; !(A1.equals(tr.myPockes[b1].name)); b1++) {
				}
				int b2 = 0;
				for (b2 = 0; !(A2.equals(tr.myPockes[b2].name)); b2++) {
				}
				bt.doBattle(tr.myPockes[b1], tr.myPockes[b2]);

				questionerr: while (true) {

					System.out.println("メニューに戻りますか？");
					System.out.println("1:はい 2:いいえ");
					int question = stdIn.nextInt();
					System.out.println();

					if (question == 1) {//はい

						continue xloop;

					} else if (question == 2) {//いいえ

						break;

					} else {//以外
						continue questionerr;
					}
				}

			} else if (x == 99) {//終了

				System.out.println("終了します");
				break;

			}
		}
	}
}
