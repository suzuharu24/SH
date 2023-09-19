package course40;

import java.util.Scanner;

public class practiceM05 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("数値を入力してください。");
		int number=stdIn.nextInt();
		boolean tf=isEven(number);
		System.out.println(tf);
	}
	static boolean isEven(int x){
		if(x%2==0) {
			boolean a=true;
			return a;
		}else {
			boolean a=false;
			return a;
		}
		
	}

}
