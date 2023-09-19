package course26;

public class ensyuu {

	public static void main(String[] args) {
		int num1=10;
		int num2=12;
		int b=1;
		String a=ransu(num1,num2,b);
		System.out.println(a);
	}
	static String ransu(int x,int y,int z){
		String kekka=" ";
		if(x<y&&z==1) {
			kekka="win!";
		}else if(x<y&&z==2) {
			 kekka="LOSE";
		}else if(x>y&&z==1) {
			 kekka="LOSE";
			
		}else if(x>y&&z==2) {
			 kekka="win!";
		}
		return kekka;
		
		
	}

}
