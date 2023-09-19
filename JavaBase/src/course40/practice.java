package course40;

public class practice {

	public static void main(String[] args) {
		int number=15;
		int age=20;
		int score=85;
		boolean isRaining=true;
		int num=31;
		
		
		if(number>=10) {
			System.out.println("でか！！");
		}
		
		if(age>=18) {
			System.out.println("大人っすね");
		}else {
			System.out.println("キッズだね＾＾");
		}
		
		if(score>=90) {
			System.out.println("Excellent");
		}else if(score>=80||score<=90) {
			System.out.println("Good");
		}else {
			System.out.println("勉強しろ");
		}
		
		if(isRaining) {
			System.out.println("傘もってけ");
		}else {
			System.out.println("よい一日を");
		}
		
		
		if(num%2==0) {
			System.out.println("偶数でっせ");
		}else {
			System.out.println("奇数だよ");
		}
		

	}

}
