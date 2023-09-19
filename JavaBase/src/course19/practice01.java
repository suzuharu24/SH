package course19;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
	
		//問題１
		String[]mygroup=new String[3];
		mygroup[0]="西口";
		mygroup[1]="根本";
		mygroup[2]="大野";
		
	for(int i=0;i<3;i++) {
		System.out.println(mygroup[i]);
	}
	
	//問題２
	int[]mygroupnum=new int[3];
	mygroupnum[0]=20;
	mygroupnum[1]=21;
	mygroupnum[2]=7;
	
	for(int i=0;i<3;i++) {
		System.out.println(mygroupnum[i]);
	}
	
	//問題3
	int[]mynum=new int[3];
	mynum[0]=10;
	mynum[1]=50;
	mynum[2]=mynum[0]+mynum[1];
	
	for(int i=0;i<3;i++);{
		
		}
	//問題４
	Scanner stdIn=new Scanner(System.in);
	int[]mynumScan=new int[3];
	mynumScan[0]=10;
	mynumScan[1]=stdIn.nextInt();
	mynumScan[2]=mynumScan[0]+mynumScan[1];
	for(int i=0;i<3;i++);{
		System.out.println(mynumScan[2]);
	}
	}

}
