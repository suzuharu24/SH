package course38_39;

import java.util.Scanner;

public class UseClass {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Pocketon poke1= new Pocketon();
		poke1.name="銭カメ";
		poke1.power=100;
		poke1.difficult=1;
		
		Pocketon poke2=new Pocketon();
		poke2.name="不思議リーフ";
		poke2.power=200;
		poke2.difficult=3;
		
		Pocketon poke3=new Pocketon();
		System.out.println("poke3の名前を決めてください");
		poke3.name=stdIn.next();
		System.out.println("poke3のパワーを設定してください");
		poke3.power=stdIn.nextInt();
		System.out.println("poke3の捕獲の難しさを設定してください");
		poke3.difficult=stdIn.nextInt();
		
		
		
		String[]arr2=new String[3];
		arr2[0]="あ";
		
		System.out.println(arr2[0]);
		
		Pocketon[]myPockes=new Pocketon[3];
		myPockes[0]=poke1;
		myPockes[1]=poke2;
		myPockes[2]=poke3;
		
		System.out.println(myPockes[0].name);
		System.out.println(myPockes[1].difficult);
		System.out.println(myPockes[2].name);
		System.out.println(myPockes[2].power);
		System.out.println(myPockes[2].difficult);
		
		for(int i=0;i<3;i++) {
			System.out.println(myPockes[i].name);
		}
		
		Student st1=new Student();
		st1.name="鈴木";
		st1.no=14;
		
		Student st2=new Student();
		st2.name="坂本";
		st2.no=10;
		
		Student[]myfriend=new Student[2];
		myfriend[0]=st1;
		myfriend[1]=st2;
		
		for(int i=0;i<2;i++) {
			System.out.println(myfriend[i].name);
		}
		
		
		myPockes[1].display();
	}

}
