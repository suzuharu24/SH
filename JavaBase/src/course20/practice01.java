package course20;

public class practice01 {

	public static void main(String[] args) {
		int[] kazu = new int[5];
		kazu[0] = 10;
		kazu[1] = 20;
		kazu[2] = 30;
		kazu[3] = 40;
		kazu[4] = 50;

		for (int i = 0; i < kazu.length; i++) {
			if (kazu[i] >29) {
				System.out.println(i + "番目の要素は30以上です");
			}
			System.out.println(kazu[i]);
		}

	}

}
