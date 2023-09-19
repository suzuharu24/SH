package course40;

public class practiceHairetu {

	public static void main(String[] args) {
		int[]i=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		for (int e : i) {
			System.out.println(e);
		}
		
		String[]cities=new String[5];
		cities[0]="東京";
		cities[1]="大阪";
		cities[2]="千葉";
		cities[3]="神奈川";
		cities[4]="埼玉笑";
		for (String e : cities) {
			System.out.println(e);
		}
		
		int[]numbers=new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		int sum=0;
		int c=0;
		for(int b=0;b<5;b++) {
			sum=sum+numbers[b];
			if(c<numbers[b]) {
				c=numbers[b];
			}
		}
		System.out.println(sum);
		System.out.println(c);
		
		for(int b=0;b<5;b++) {
			if(numbers[b]/10%2==1) {
				numbers[b]=numbers[b]+1;
				System.out.println(numbers[b]);
			}
		}
		
		
		
		
		
		
	}
	
	

}
