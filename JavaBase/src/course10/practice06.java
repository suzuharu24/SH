package course10;

import java.util.Scanner;

public class practice06 {

	public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
System.out.println("ｘに数値を入力してください");
	int x= stdIn.nextInt();
	System.out.println("yに数値を入力してください");
	int y= stdIn.nextInt();
	
	if(x>y) {
		System.out.println("ｘがでかい。"
				+"なぜならxは"+x+"で"+"yは"+y+"だから");
	}else 
	if(x<y) {
			System.out.println("yがでかい。"+"なぜならyは"+y+"で"+"xは"+x+"だから");
	}else
		if(x==y) {
			System.out.println("おなじ");
		}
		}
	
	
	}

