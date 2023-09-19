package course54_55;

public class student {

	private int syussekibango;
	private String name;

	public student() {
		System.out.println("コンストラクタが動いたよ。");
	}

	public student(int userInputSyusseki, String userInputName) {
		this.syussekibango = userInputSyusseki;
		this.name = userInputName;
	}

	public int getSyussekibango() {
		return syussekibango;
	}

	public void setSyussekibango(int syussekibango) {
		this.syussekibango = syussekibango;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}