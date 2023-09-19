package course40;

public class practiceM06 {

	public static void main(String[] args) {
		String name="鈴木";
		String moji=getGreeting(name);
		System.out.println(moji);	
	}
	static String getGreeting(String x){
		String a="こんにちは,"+x;
		return a;
	}

}
