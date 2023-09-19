package course28;

public class Sample01 {

	public static void main(String[] args) {
		
		
	//インスタンス
		//「hu1」はHumanのインスタンス(実体)
		//インスタンスに対してパラメータを設定する。
		Human hu1= new Human();
		hu1.name="坂本";
		hu1.kotoba="ラブ＆ピース";
		
		hu1.hp=50;
		hu1.neru();
		
		System.out.println(hu1.name);
		
		//chrクラスのインスタンス「numata」を生成。
		//パラメーターを設定する
		
		chr numata=new chr();
		numata.attack=80;
		numata.def=64;
		numata.hp=156;
		numata.love=5;
		numata.mp=120;
		numata.spd=70;
		
		//chrクラスのインスタンス「kajima」を生成
		//パラメーターを設定する
		chr kajima=new chr();
		kajima.attack=70;
		kajima.def=60;
		kajima.hp=130;
		kajima.love=40;
		kajima.mp=60;
		kajima.spd=140;
		
		kajima.naguru(kajima.attack,numata.def);
		
		

	}

}
