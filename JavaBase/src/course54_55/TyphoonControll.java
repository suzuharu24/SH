package course54_55;

import java.util.Scanner;

public class TyphoonControll {

	public static void main(String[] args) {
		Typhoon ty1 = new Typhoon(401, "2022年4月8日", "マラカス");
		Typhoon ty2 = new Typhoon(402, "2022年4月10日", "メーギー");
		Typhoon ty3 = new Typhoon(403, "2022年6月30日", "チャバ");
		Typhoon ty4 = new Typhoon(404, "2022年7月1日", "アイレー");
		Typhoon ty5 = new Typhoon(405, "2022年7月28日", "ソンクダー");
		Typhoon ty6 = new Typhoon(406, "2022年7月31日", "トローセス");
		Typhoon ty7 = new Typhoon(407, "2022年8月9日", "ムーラン");
		Typhoon ty8 = new Typhoon(408, "2022年8月12日", "メアリー");
		Typhoon ty9 = new Typhoon(409, "2022年8月22日", "マーゴン");

		Typhoon[] typhoonList = new Typhoon[9];

		Scanner stdIn = new Scanner(System.in);

		typhoonList[0] = ty1;
		typhoonList[1] = ty2;
		typhoonList[2] = ty3;
		typhoonList[3] = ty4;
		typhoonList[4] = ty5;
		typhoonList[5] = ty6;
		typhoonList[6] = ty7;
		typhoonList[7] = ty8;
		typhoonList[8] = ty9;

		System.out.println("入力してください");
		System.out.println("0:台風名表示 55:新規追加 99:編集");
		int a = stdIn.nextInt();
		System.out.println();
		
		if(a==0) {
			for (int i = 0; i < 9; i++) {//表示
				System.out.println(typhoonList[i].getAsiaName());
			
		}}else 
			if(a==55) {
			System.out.println("台風番号を入力してください");
			System.out.println("例：令和３年台風6号の場合　306");
			int tynm=stdIn.nextInt();
			System.out.println();
			
			System.out.println("発生日を入力してください");
			System.out.println("例：2023年3月18日");
			String tydy=stdIn.next();
			System.out.println();
			
			System.out.println("台風名を入力してください");
			String tyname=stdIn.next();
			System.out.println();
			
			typhoonList[9].setTyphoonbango(tynm);
			typhoonList[9].setHasseibi(tydy);
			typhoonList[9].setAsiaName(tyname);
			
			
			
		}else 
			if (a == 99) {//編集
			System.out.println("編集したい台風番号を入力してください");
			System.out.println("例：401,402");
			int b = stdIn.nextInt();
			System.out.println();
			if (b == 401) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[0].setAsiaName(c);

			} else if (b == 402) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[1].setAsiaName(c);

			} else if (b == 403) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[2].setAsiaName(c);
				
			} else if (b == 404) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[3].setAsiaName(c);
				
			} else if (b == 405) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[4].setAsiaName(c);
				
			} else if (b == 406) {
				System.out.println("変更後の名前を入力してください");
				String c = stdIn.next();
				typhoonList[5].setAsiaName(c);
			}
			  else if (b == 407) {
			    System.out.println("変更後の名前を入力してください");
			    String c = stdIn.next();
			    typhoonList[6].setAsiaName(c);
		    }
			  else if(b==408) {
				System.out.println("変更後の名前を入力してください");
				String c=stdIn.next();
				typhoonList[7].setAsiaName(c);
			}
			  else if(b==409) {
				System.out.println("変更後の名前を入力してください");
				String c=stdIn.next();
				typhoonList[8].setAsiaName(c);
				}
			
			
			
			
			
		for (int i = 0; i < 9; i++) {//表示
			System.out.println(typhoonList[i].getAsiaName());
		}

	}
}
}