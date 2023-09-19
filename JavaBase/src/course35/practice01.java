package course35;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);

		System.out.println("xの値を入力してください。");
		int x=stdIn.nextInt();
	if(x>50) {
		System.out.println("yの値を入力してください。");
		int y=stdIn.nextInt();
		calc(x,y);
		}else if(x<50) {
		calc(x);
		}
	}
	
	
	static void calc(int a,int b) {
	System.out.println(a+b);	
	}
	static void calc(int a) {
		System.out.println(a*10);
	}
	}

