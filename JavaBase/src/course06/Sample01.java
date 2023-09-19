package course06;

public class Sample01 {

	public static void main(String[] args) {

		int a = 51;

		//if文の鉄板文法
		if (a > 50) {
			System.out.println("aは50よりでかい");
		} else {
			System.out.println("小さい");

		}

		String c = "あいうえお";
		String d = "かきくけこ";

		if (c.equals(d)) {
			System.out.println("文字は一緒");
		} else {
			System.out.println("違う文字です");
		}

		if (c.equals("さしすせそ")) {
			System.out.println("文字は違います");
		} else {
			System.out.println("違うよ");
		}
	}

}
