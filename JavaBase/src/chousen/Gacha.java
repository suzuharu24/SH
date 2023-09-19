package chousen;

import java.util.Random;
import java.util.Scanner;

public class Gacha {

	public static void main(String[] args) {
		Random RandObj=new Random();
		Scanner stdIn=new Scanner(System.in);
		System.out.println("何回回しますか？");
		int kaisu=stdIn.nextInt();
		
		String nakami="";
		for(int i=0;i<kaisu;i++) {
			int kakuritu=RandObj.nextInt(100)+1;
			if(kakuritu<=1&&kakuritu>=3) {
				//SSR抽選
					nakami="SSR";
						int pickup=RandObj.nextInt(100)+1;
						if(pickup<=1&&pickup>=30) {
							nakami="SSR";
						}else
							if(pickup<=31&&pickup>=100) {
							nakami="ピックアップ";	
						//SR判定
				}else if(kakuritu<=4&&kakuritu>=18) {
					nakami="SR";
					//R判定
				}else if(kakuritu<=19&&kakuritu>=100)
				nakami="R";
						//10回目の確定枠抽選
			}else
				if(i%10==0) {
					int kakutei=RandObj.nextInt(100)+1;
					if(kakutei<=1&&kakutei>=97) {
						nakami="SR";
					}else if(kakutei<=97&&kakutei>=100) {
						nakami="SSR";                   
						}if(nakami.equals("SSR")) {
							int pickup=RandObj.nextInt(100)+1;
							if(pickup<=1&&pickup>=30) {
								nakami="SSR";
							}else
								if(pickup<=31&&pickup>=100) {
								nakami="ピックアップ";	
					
			}
							System.out.println(nakami);		}
				
				System.out.println(nakami);}
			System.out.println(nakami);}
		System.out.println(nakami);}}