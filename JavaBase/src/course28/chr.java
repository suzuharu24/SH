package course28;

public class chr {

	static int attack;
	static int def;
	static int spd;
	static int love;
	static int mp;
	static int hp;
	
	static void naguru(int naguruattack,int naguraredef) {
		System.out.println((naguruattack*2)+"のダメージを与えた");
	}
	static void mamoru() {
		System.out.println("守りをかためて防御が"+(def*2)+"になった。");
	}
}