package course22;

import java.util.Arrays;

public class practice01 {

	public static void main(String[] args) {
		String[][]moji=new String[3][3];
		moji[0][0]="o";
		moji[0][1]="x";
		moji[0][2]="o";
		
		moji[1][0]="x";
		moji[1][1]="o";
		moji[1][2]="x";
		
		moji[2][0]="o";
		moji[2][1]="o";
		moji[2][2]="o";
		
		int k=0;
		
		System.out.println(moji[2][1]);
		System.out.println(Arrays.deepToString(moji));
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(moji[i][j]);
				if(moji[i][j]=="o") {
					k++;
				}
			}
		}
		System.out.println(k+"個");
		
		
		
	}

}
