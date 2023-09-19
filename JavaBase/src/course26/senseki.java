package course26;

public class senseki {

	public static void main(String[] args) {
		int gamecount=9;
		int wincount=6;	
		int losecount=3;
		
		dispResult(gamecount,wincount,losecount);
		
	double q=syouritu(gamecount,wincount);
		System.out.println("勝率"+q+"％");
		
		
	}
	static void dispResult(int x,int y,int z) {
		System.out.println("合計ゲーム数,"+x+"ゲーム");
		System.out.println("勝利数,"+y+"ゲーム");
		System.out.println("敗北数,"+z+"ゲーム");
		
	}
	static double syouritu(double x,double y) {
		double a=(y/x) * 100;
		return a;
		
	}

}
