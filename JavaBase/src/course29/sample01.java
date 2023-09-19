package course29;

public class sample01 {

	public static void main(String[] args) {
		
		Human human1=new Human();
		
		human1.name="システム太郎";
		human1.hobby="基数変換";
		human1.address="サーティファイ本社";
		
		Human human2=new Human();
		
		human2.name="システム花子";
		human2.hobby="パック10進数";
		human2.address="国際理工学園182号館";
		
		
		human1.talk();
		human2.run();
		
		Human me=new Human();
		
		me.name="鈴木陽哉";
		me.hobby="タルコフ";
		me.address="成田";
		
		me.talk();
	}

}
