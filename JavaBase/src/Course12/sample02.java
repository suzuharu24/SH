package Course12;

public class sample02 {

	public static void main(String[] args) {
		//変則系
		int x = 0;
		do {
			if (x < 3) {
				System.out.println("ifとの組み合わせ");
			} else if (x == 2) {
				break;
			}
			x++;
		} while (x < 3);

	}

}
