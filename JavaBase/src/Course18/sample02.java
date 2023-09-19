package Course18;

public class sample02 {

	public static void main(String[] args) {
		
		//yesかnoを扱うboolean型もある。
		
		boolean x=true;
		
		boolean y=false;
		
		//if文は括弧の中がtrueかどうかを判定する。
		if(x) {
			System.out.println("TRUEだよ");
		}else {
			System.out.println("FALSEだよ");
		}
		
		//今までやってきた比較も最終的にはFALSEかTRUEでしかない
		int i=30;
		boolean z=i>15;
		if(z) {
			System.out.println("iは15よりも大きいです");
		}else {
			System.out.println("iは15以下です。");
		}
		
		
	}

}
