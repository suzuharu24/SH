package course20;

public class practice05 {

	public static void main(String[] args) {
		String[]arr= {"x","y","x","y","x"};
		int x=0;
		for(String moji:arr) {
			if("x".equals(moji)) {
				x=x+1;
			}
		}System.out.println(x+"個");

	}

}
