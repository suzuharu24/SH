package course44;

public class UseClass {

	public static void main(String[] args) {

		Human human = new Human();

		//humanクラス
		human.setName("システム太郎");
		human.setHobby("プログラミング");
		human.setweight(60000);

		human.disp();
		human.dispWeight();

		human.eat("ハンバーガー", 1200);

		human.dispWeight();
		
		animal ani=new animal();
		
		ani.setName("サイ");
		ani.setweight(7000000);
		ani.setKari("角で相手を粉砕する。");
		ani.setJumyou(30);
		ani.death(ani.getName());
		
		ani.display();
	}

}
