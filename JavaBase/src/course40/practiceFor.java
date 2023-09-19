package course40;

public class practiceFor {

	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		
		for(int x=1;x<100;x++) {
			System.out.println("現在"+x+"回目のループです。");
			if(x%2==0) {
				System.out.println("偶数です");
			}
		}
		
		for(int z=10;z>0;z--) {
			System.out.println(z);
		}
		int sum=0;
		for(int y=1;y<101;y++) {
			sum=sum+y;
		}
		System.out.println(sum);
	}

}
