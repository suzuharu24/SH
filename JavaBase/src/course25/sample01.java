package course25;

public class sample01 {

	public static void main(String[] args) {
		//変数「z」で戻り値を受け取る
		int z = modoSample(30, 50);
		System.out.println("30と50の合計値は" + z + "です。");
		
	}

	static int modoSample(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
