package Sougouennsyuu;

import java.util.Random;

public class Trainer {
	String name;
	Pocketon[] myPockes = new Pocketon[6];

	Trainer(String a) {
		name = a;
	}

	void capture(Pocketon pocke) {
		
		Random rnd = new Random();
		
		int c = rnd.nextInt(10) + 1;
		
		if (c > pocke.difficult) {
			System.out.println("捕獲成功");
			System.out.println();

			if (myPockes[0]==null) {
				myPockes[0] = pocke;
				
			} else if (myPockes[1]==null) {
				myPockes[1] = pocke;
				
			} else if (myPockes[2]==null) {
				myPockes[2] = pocke;
				
			} else if (myPockes[3]==null) {
				myPockes[3] = pocke;
				
			} else if (myPockes[4]==null) {
				myPockes[4] = pocke;
				
			} else if (myPockes[5]==null) {
				myPockes[5] = pocke;
			}
		} else if (c < pocke.difficult) {
			System.out.println("捕獲失敗");
			System.out.println();
		}

	}

	void display() {
		for(int d=0;d<myPockes.length;d++) {
			if(myPockes[d]==null) {
				System.out.println("登録なし");
				
			}else{
				System.out.println(myPockes[d].name);
			}
		}
	}

}
