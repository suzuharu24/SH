package course23;

public class sample02 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//int型変数「a」　「b」をメゾットに渡して呼び出す。
		plus(a,b);
		
		System.out.println("呼び出し終わったよ");

	}

	
	//呼び出される側
	//int「a」の値がint「x」に、int「ｂ」の値がint「y」に格納されてる
	static void plus(int x,int y) {
		System.out.println(x+y);
	}
}
