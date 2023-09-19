package course54_55;

public class Typhoon {
	private int typhoonbango;
	private String hasseibi;
	private String asiaName;
	
	//デフォルトコンストラクタ
	public Typhoon(){
		System.out.println("コンストラクタ");
	}
	//引数有りコンストラクタ
	public Typhoon(int userInputtyphoon,String userInputhassei,String userInputasia) {
		this.typhoonbango=userInputtyphoon;
		this.hasseibi=userInputhassei;
		this.asiaName=userInputasia;
	}
	
	
	//getter,setter
	public int getTyphoonbango() {
		return typhoonbango;
	}
	public void setTyphoonbango(int typhoonbango) {
		this.typhoonbango = typhoonbango;
	}
	public String getHasseibi() {
		return hasseibi;
	}
	public void setHasseibi(String hasseibi) {
		this.hasseibi = hasseibi;
	}
	public String getAsiaName() {
		return asiaName;
	}
	public void setAsiaName(String asiaName) {
		this.asiaName = asiaName;
	}
	
	
	
	
}
