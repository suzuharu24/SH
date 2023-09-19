package course29;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		charcter2 me=new charcter2();
		System.out.println("プレイヤー1のステータスを入力してください。");
		System.out.println("名前を入力してください。");
		me.name=stdIn.next();
		System.out.println("HPを設定してください。");
		me.hp=stdIn.nextInt();
		System.out.println("攻撃力を設定してください。");
		me.str=stdIn.nextInt();
		System.out.println("防御力を設定してください。");
		me.def=stdIn.nextInt();
		System.out.println("命中率を設定してください。");
		me.dex=stdIn.nextInt();
		System.out.println("回避率を設定してください。");
		me.agi=stdIn.nextInt();
		
		me.viewStatus();
		
		charcter2 tonari=new charcter2();
		System.out.println("プレイヤー2のステータスを入力してください。");
		System.out.println("名前を入力してください。");
		tonari.name=stdIn.next();
		System.out.println("HPを設定してください。");
		tonari.hp=stdIn.nextInt();
		System.out.println("攻撃力を設定してください。");
		tonari.str=stdIn.nextInt();
		System.out.println("防御力を設定してください。");
		tonari.def=stdIn.nextInt();
		System.out.println("命中率を設定してください。");
		tonari.dex=stdIn.nextInt();
		System.out.println("回避率を設定してください。");
		tonari.agi=stdIn.nextInt();
		
		
		
		tonari.viewStatus();
		
		me.battle(me,tonari);
		
	}

}
