package course15;

import java.util.Random;
import java.util.Scanner;

public class pea1 {

	public static void main(String[] args) {
		
		int a=10000;
		while(a>0&&a<=50000);
		System.out.println("現在の所持金は"+a+"です。");
		System.out.println("掛け金を入力してください。");
		Scanner stdIn =new Scanner(System.in);
		int b=stdIn.nextInt();
		
		if(a<b) {
			b=a;
			System.out.println("掛け金は"+a+"です");
		}
		a=a-b;System.out.println(a);
		
		
		Random rnd =new Random();
		int c=rnd.nextInt(7)+1;
		int d=rnd.nextInt(7)+1;
		int e=rnd.nextInt(7)+1;
		System.out.println(c+","+d+","+e+",");
		
		//１１１	
		if(c+d+e==3) {
		System.out.println("ビンゾロ");
		int y=z+b*5;
		}else
		//ゾロ目
		if(c==d && d ==e && c != 1) {
		System.out.println("ゾロ目");
		int y=z+b*3;
		}else
		//四五六
		if(c==4&&d==5&&e==6||c==4&&d==6&&e==5||c==5&&d==4&&e==6||c==5&&d==6&&e==4||c==6&&d==5&&e==4||c==6&&d==4&&e==5) {
		System.out.println("シゴロ");
		int y=z+b*2;
		}else
		//通常の目
		if(c==2&&d==2&&e==6||c==2&&d==6&&e==2||c==6&&d==2&&e==2) {
		System.out.println("通常");
		int y=z+b;
		}else
		if(c==2&&d==2&&e==5||c==2&&d==5&&e==2||c==5&&d==2&&e==2) {
		System.out.println("通常");
		int y=z+b;
		}else
		if(c==2&&d==2&&e==4||c==2&&d==4&&e==2||c==4&&d==2&&e==2) {
		System.out.println("通常");
		int y=z+b;
		}else
		if(c==2&&d==2&&e==3||c==2&&d==3&&e==2||c==6&&d==2&&e==2) {
		System.out.println("通常");
		int y=z+b;
		}else
		if(c==3&&d==3&&e==2||c==3&&d==2&&e==3||c==2&&d==3&&e==3) {
		System.out.println("通常");
		int y=z+b;
		}else
		if(c==2&&d==2&&e==1||c==2&&d==1&&e==2||c==1&&d==2&&e==2) {
		System.out.println("通常");
		int y=z+b;
		}else
		//ションベン
		if(c==7&&d==7||c==7&&e==7||d==7&&e==7) {
		System.out.println("ションベン");
		int y=z-b;
		}else
		//一二三
		if(c==1&&d==2&&e==3||c==1&&d==3&&e==2||c==2&&d==1&&e==3||c==2&&d==3&&e==1||c==3&&d==2&&e==1||c==3&&d==1&&e==2) {
		System.out.println("一二三");
		int y=z-b*2;
		}else {
		System.out.println("役無し");
		int y=z-b;
		}
		
	
	}
		
	

	}


