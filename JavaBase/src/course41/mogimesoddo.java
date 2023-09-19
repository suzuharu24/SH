package course41;

public class mogimesoddo {

	public static void main(String[] args) {
		mogi();

		calc(10, 11);

		String moji = "今のところ正解でしょ？";
		String x = mojicon(moji);
		System.out.println(x);
	}

	static void mogi() {
		System.out.println("メソッド問題");
	}

	static void calc(int a, int b) {
		System.out.println(a + b);
	}

	static String mojicon(String a) {
		String concated = a + "を受け取りました。";
		return concated;
	}

}
