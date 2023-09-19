package course29;

public class charcter2 {
	String name;
	int hp;
	int str;
	int dex;
	int agi;
	int def;

	void viewStatus() {
		System.out.println(name + "のステータスは");
		System.out.println("HP:" + hp);
		System.out.println("str:" + str);
		System.out.println("dex:" + dex);
		System.out.println("agi:" + agi);
		System.out.println("def:" + def);
	}

	void battle(charcter2 me, charcter2 tonari) {
		System.out.println(me.name + "と" + tonari.name + "の熱い戦いが始まる・・・！");

		//hpが続く限り戦いを続けるための処理
		while (me.hp > 0 && tonari.hp > 0) {

			if (me.agi >= tonari.agi) {
				tonari.hp = tonari.hp - (me.str - tonari.def);
				tonari.agi = tonari.agi + 10;
			} else {
				me.hp = me.hp - (tonari.str - me.def);
				me.agi = tonari.agi + 10;
			}
			System.out.println(me.name + "のHP" + me.hp);
			System.out.println(tonari.name + "のHP" + tonari.hp);

		}
		System.out.println("は死亡した。だが、皆の記憶の中で生き続ける。");

	}
}
	
	
	


