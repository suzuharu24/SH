package course19;

import java.util.Scanner;

public class Practice03 {

	//問題6
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] numArray = new int[3];
		System.out.println("数値を入力してください。");
		numArray[0] = stdIn.nextInt();
		numArray[1] = stdIn.nextInt();
		numArray[2] = stdIn.nextInt();
	for(int i=0;i<3;i++) {
		System.out.println(numArray[i]);
	}

}}
