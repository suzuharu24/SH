package course22;

import java.util.Scanner;

public class ensyuu {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String[][]moji= new String[3][3];
		moji[0][0]="☆";
		moji[0][1]="□";
		moji[0][2]="☆";
		
		moji[1][0]="□";
		moji[1][1]="☆";
		moji[1][2]="△";
		
		moji[2][0]="△";
		moji[2][1]="□";
		moji[2][2]="△";
		
		for(int z=0;z<100;z++) {
		System.out.println("りこドラ");
		
		System.out.println("現在のパネル↓");
		
		String x="0";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(moji[i][j]);
			}
			System.out.println();
		}
		System.out.println("入れ替え位置を入力してください。[?](縦)[](横)");
		int a=stdIn.nextInt();
		System.out.println("入れ替え位置を入力してください。[](縦)[?](横)");
		int b=stdIn.nextInt();
		System.out.println("入れ替え先の位置を入力してください。[?](縦)[](横)");
		int a1=stdIn.nextInt();
		System.out.println("入れ替え先の位置を入力してください。[](縦)[?](横)");
		int b2=stdIn.nextInt();
		
		x=moji[a][b];
		moji[a][b]=moji[a1][b2];
		moji[a1][b2]=x;
		
		if(moji[0][0].equals(moji[0][1])&&moji[0][0].equals(moji[0][2]));{
		moji[0][0]="G";
		moji[0][1]="G";
		moji[0][2]="G";}
	
			if(moji[0][0].equals(moji[1][0])&&moji[0][0].equals(moji[2][0]));{
		moji[0][0]="G";
		moji[1][0]="G";
		moji[2][0]="G";}
			 if(moji[0][1].equals(moji[1][1])&&moji[0][1].equals(moji[2][1]));{
				moji[0][1]="G";
				moji[1][1]="G";
				moji[2][1]="G";}
			 if(moji[1][0].equals(moji[1][1])&&moji[1][0].equals(moji[1][2]));{
				moji[1][0]="G";
				moji[1][1]="G";
				moji[1][2]="G";}
		
		
		
		
		
		
		
				
		
		
	}

}
}