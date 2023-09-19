package course31;
public class sample02 {

	public static void main(String[] args) {
		Books[]arr=new Books[3];
		
		Books book1=new Books("ITワールド",100,"サーティファイ");
		Books book2=new Books("明解Java",400,"柴田望洋");
		arr[0]=book1;
		arr[1]=book2;
		
		//配列にしまったインスタンスを呼び出す時は
		//以下のように書く。
		System.out.println(arr[1].name);
		

}
	}