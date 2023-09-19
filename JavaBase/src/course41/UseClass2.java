package course41;

public class UseClass2 {

	public static void main(String[] args) {
		Food food1 = new Food();
		food1.name = "米";
		food1.price = 1000;

		Food food2 = new Food();
		food2.name = "魚";
		food2.price = 100;

		Food food3 = new Food();
		food3.name = "肉";
		food3.price = 500;

		Food food4 = new Food();
		food4.name = "パン";
		food4.price = 200;

		Food[] menu = new Food[3];
		menu[0] = food1;
		menu[1] = food2;
		menu[2] = food3;
		menu[3] = food4;
	}

}
