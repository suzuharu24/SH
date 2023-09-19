package course44;

public class Human extends Creatures {

	//変数
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	private String hobby;

	//メソッド
	void disp() {
		System.out.println("私の名前は" + this.name + "です");
		System.out.println("私の趣味は" + this.hobby + "です");

	}

	public String getName() {
		return name;
	}

	public String getHobby() {
		return hobby;
	}

	void dispWeight() {
		System.out.println("体重は" + super.getweight() + "gです");
	}

}
