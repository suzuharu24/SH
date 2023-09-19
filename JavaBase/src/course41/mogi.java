package course41;

import java.util.Scanner;

public class mogi {

public static void main(String[] args) {
	Scanner stdIn=new Scanner(System.in);
	
	String moji="模擬テスト。100点とります。";
	
	int x=50;
	int y=100;
	int z=x*y;
	
	String a=stdIn.next();
	
	int b=stdIn.nextInt();
	
	boolean isRaining=true;
	
	for(int i=0;i<5;i++) {
		System.out.println(i);	
	}
	
	System.out.println(moji);
	
	System.out.println(z);
	
	System.out.println(a);
	
	if(b>=50) {
		System.out.println("50以上です。");
	}else {
		System.out.println("49以下です。");
	}
	
	if(isRaining) {
		System.out.println("傘をもってけーーー");
	}else {
		System.out.println("よい一日を！");
	}
	
	
	}

}
