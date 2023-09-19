package course57;

import java.util.Random;
import java.util.Scanner;

public class kazuate {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner stdIn=new Scanner(System.in);
		
		int ransu=rnd.nextInt(100)+1;
		
		for(int i=0;i<100;i++) {
			
			System.out.println("1から100までの数字を1つ入力してください");
			int yosou=stdIn.nextInt();
			
			if(ransu<yosou) {
				System.out.println("答えはもっと小さい数字です。");
				System.out.println();
				
			}else
				if(ransu>yosou) {
				System.out.println("答えはもっと大きい数字です。");
				System.out.println();
				
			}else 
				if(ransu==yosou) {
					System.out.println("大正解！！");
					System.out.println(i+"回目でクリア!");
					i=i+100;
				}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
	}

}
