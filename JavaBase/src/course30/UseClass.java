package course30;

public class UseClass {

	public static void main(String[] args) {
		Drink syouhin=new Drink(100,"初期データ");
		syouhin.price=150;
		syouhin.name="午後の紅茶";
		
		syouhin.display();
		int sum=syouhin.calcSum(syouhin.price,43);
		System.out.println("合計は"+sum);
		
		
		
		

	}

}
