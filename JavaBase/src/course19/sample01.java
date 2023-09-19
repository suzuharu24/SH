package course19;

public class sample01 {

	public static void main(String[] args) {
		
		String a="根本";
		String b="谷口";
		String c="大野";
		String d="鈴木";
		String e="安田";
		String f="伊藤";
		
		//配列の鉄板構文
		//[]の事を要素と呼ぶ。要素は0から始まる。
		String[]nameList=new String[10];
		nameList[0]="根本";
		nameList[1]="谷口";
		nameList[2]="大野";
		nameList[3]="鈴木";
		nameList[4]="安田";
		nameList[5]="伊東";
		
		for(int i=0;i<6;i++) {
			System.out.println("友達の名前は"+nameList[i]);
		}

		
		
	}

}
