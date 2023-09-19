package course57;

import java.util.Random;
import java.util.Scanner;

public class PlayControll {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner stdIn = new Scanner(System.in);

		Player me = new Player();

		int Gk = rnd.nextInt(4) + 1;
		me.setGakurtoku(Gk);

		int Ki = rnd.nextInt(4) + 1;
		me.setKinryoku(Ki);

		int Mi = rnd.nextInt(4) + 1;
		me.setMitame(Mi);

		int Om = rnd.nextInt(4) + 1;
		me.setOmosiro(Om);

		Target koku = new Target();

		int hitugaku = rnd.nextInt(11) + 3;
		koku.setHituyouGaku(hitugaku);

		int hitukin = rnd.nextInt(11) + 3;
		koku.setHituyouKin(hitukin);

		int hitumita = rnd.nextInt(11) + 3;
		koku.setHituyouMita(hitumita);

		int hituomo = rnd.nextInt(11) + 3;
		koku.setHituyouOmo(hituomo);

		for (int i = 0; i < 7; i++) {

			System.out.println("現在のパラメーター");
			System.out.println("学力:" + Gk);
			System.out.println("筋肉:" + Ki);
			System.out.println("見た目:" + Mi);
			System.out.println("面白さ:" + Om);

			System.out.println("どのトレーニングをするか選んでください。");
			System.out.println("トレーニングメニュー");
			System.out.println("1:勉強");
			System.out.println("2:筋トレ");
			System.out.println("3:整形");
			System.out.println("4:人と喋る");
			int tre = stdIn.nextInt();

			if (tre == 1) {
				System.out.println("勉強をして学力が1上がった。");
				Gk = Gk + 1;
				me.setGakurtoku(Gk);

			} else if (tre == 2) {
				System.out.println("筋トレをして筋力が1上がった。");
				Ki = Ki + 1;
				me.setKinryoku(Ki);

			} else if (tre == 3) {
				System.out.println("整形をして見た目が1上がった。");
				Mi = Mi + 1;
				me.setMitame(Mi);

			} else if (tre == 4) {
				System.out.println("人と喋って面白さが1上がった。");
				Om = Om + 1;
				me.setOmosiro(Om);
			}

			int rndpara = rnd.nextInt(3) + 1;

			if (rndpara == 1) {
				int a = hitugaku - Gk;
				System.out.println("成功まであと" + a);
				System.out.println("相手の学力は" + hitugaku + "です。");
				System.out.println();

			} else if (rndpara == 2) {
				int a = hitukin - Ki;
				System.out.println("成功まであと" + a);
				System.out.println("相手の筋力は" + hitukin + "です。");
				System.out.println();

			} else if (rndpara == 3) {
				int a = hitumita - Mi;
				System.out.println("成功まであと" + a);
				System.out.println("相手の見た目は" + hitumita + "です。");
				System.out.println();

			} else if (rndpara == 4) {
				int a = hituomo - Om;
				System.out.println("成功まであと" + a);
				System.out.println("相手の面白さは" + hituomo + "です。");
				System.out.println();

			}
		}
		System.out.println("どの能力で勝負しますか？");
		System.out.println("1:学力");
		System.out.println("2:筋力");
		System.out.println("3:見た目");
		System.out.println("4:面白さ");
		int b = stdIn.nextInt();

		int mernd = rnd.nextInt(3) + 1;
		int kokurnd = rnd.nextInt(3) + 1;

		}}