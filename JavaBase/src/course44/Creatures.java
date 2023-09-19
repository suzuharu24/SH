package course44;

public class Creatures extends Life {

	//変数
	private int weight;

	//メソッド
	void eat(String food, int cal) {
		System.out.println(food + "を食べた。体重が" + cal + "g増えた。");
		this.weight = this.weight + cal;
	}

	public int getweight() {
		return weight;
	}

	public void setweight(int weight) {
		this.weight = weight;

	}

}
