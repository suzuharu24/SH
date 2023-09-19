package course29;

public class charcter {
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP" + hp);
		System.out.println("攻撃力" + str);
		System.out.println("防御力" + def);
		System.out.println("命中率" + dex);
		System.out.println("回避率" + agi);
	}

	void battle(Character player1, Character player2) {
		System.out.println(player1.name + "と" + player2.name + "の熱い戦いが始まる・・・！");

		//hpが続く限り戦いを続けるための処理
		while (player1.hp >= 0 && player2.hp > 0) {
			if (player1.agi > player2.agi) {
				int x = player1.str - player2.def;
				player2.hp = player2.hp - x;
				player2.agi = player2.agi + 10;
				System.out.println("player2に" + x + "のダメージ");
			} else if (player1.agi <= player2.agi) {
				int x = player2.str - player1.def;
				player1.hp = player1.hp - x;
				player1.agi = player1.agi + 10;
				System.out.println("player1に" + x + "のダメージ");
			}
			if (player1.agi >= player2.agi) {
				int y = player2.str - player1.def;
				player1.hp = player1.hp - y;
				System.out.println("player1に" + y + "のダメージ");
			} else if (player1.agi <= player2.agi) {
				int y = player1.str - player2.def;
				player2.hp = player2.hp - y;
				System.out.println("player2に" + y + "のダメージ");
			}
			System.out.println("1のHP" + player1.hp);
			System.out.println("2のHP" + player2.hp);

			//player1とplayer2のagiを比較して、高い方が先制攻撃！
			//攻撃は「攻撃者のstr - 被攻撃者のdef」の結果を相手を被攻撃者のHPから引く
			//先制攻撃終了後、agiの低い方が攻撃を行う。

			System.out.println("は死亡した。だが、皆の記憶の中で生き続ける。");
		}
	}
}