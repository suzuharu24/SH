package course33pair;



public class practice01 {

	public static void main(String[] args) {
		
		int x=50;
		int y=100;
		int z=x*y;
		System.out.println(z);
		
		for(int a=0;a<=4;a++){
			System.out.println(a+"回目のループです");
		}
		
		int[]numarr=new int[5];
		numarr[0]=10;
		numarr[1]=20;
		numarr[2]=30;
		numarr[3]=40;
		numarr[4]=50;
		
		for(int a:numarr) {
			System.out.println(a);
			
		}
		
		
		
		
		
		
	}

}
