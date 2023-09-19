package course20;

public class practice02 {

	public static void main(String[] args) {
				int[] kazu = new int[5];
				kazu[0] = 10;
				kazu[1] = 20;
				kazu[2] = 30;
				kazu[3] = 40;
				kazu[4] = 50;
				
				int x=0;

				for (int i = 0; i < kazu.length; i++) {
					x=x+kazu[i];
				}
				System.out.println(x);

			}


	}
