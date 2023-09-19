package course22;

import java.util.Arrays;

public class sample01 {

	public static void main(String[] args) {
		int [][]arr=new int[3][3];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		
		arr[2][0]=70;
		arr[2][1]=80;
		arr[2][2]=90;
		
		System.out.println(arr[1][0]);
		
		
//問題２
	if(arr[2][0]>50) {
		System.out.println("大きいです");
	}
	//問題３
	int sum=0;
	sum=arr[1][1]+arr[2][2];
	System.out.println(sum);
	
	
	//問題4
	System.out.println(Arrays.deepToString(arr));
	}
	
	
	
	
	
	
	
}