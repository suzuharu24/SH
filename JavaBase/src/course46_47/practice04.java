package course46_47;

public class practice04 {

	public static void main(String[] args) {
		try {
			int result = divideNumbers(10, 1);
		    System.out.println(result);
		
	}catch (Exception e) {
		System.out.println(e);
		
	}

	}
	public static int divideNumbers(int a, int b) {
        return a / b;
    }


}
