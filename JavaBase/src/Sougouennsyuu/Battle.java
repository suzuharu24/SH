package Sougouennsyuu;

public class Battle {
	String winner;

	String doBattle(Pocketon poke1, Pocketon poke2) {
		if (poke1.type.equals("水") && poke2.type.equals("火")) {
			poke1.power = poke1.power * 2;
		}

		if (poke1.type.equals("火") && poke2.type.equals("草")) {
			poke1.power = poke1.power * 2;
		}
		
		if (poke1.type.equals("草") && poke2.type.equals("地面")) {
			poke1.power = poke1.power * 2;
		}
		
		if (poke1.type.equals("地面") && poke2.type.equals("水")) {
			poke1.power = poke1.power * 2;
		}
		
		if (poke2.type.equals("水") && poke1.type.equals("火")) {
			poke2.power = poke2.power * 2;
		}
		
		if (poke2.type.equals("火") && poke1.type.equals("草")) {
			poke2.power = poke2.power * 2;
		}
		
		if (poke2.type.equals("草") && poke1.type.equals("地面")) {
			poke2.power = poke2.power * 2;
		}
		
		if (poke2.type.equals("地面") && poke1.type.equals("水")) {
			poke2.power = poke2.power * 2;
		}

		if (poke1.power > poke2.power) {
			winner = poke1.name;
			System.out.println("勝者" + winner);
			System.out.println();

		} else if (poke1.power < poke2.power) {
			winner = poke2.name;
			System.out.println("勝者" + winner);
			System.out.println();

		} else {
			System.out.println("引き分け");
		}
		return winner;

	}
}
