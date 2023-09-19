package Course36;

public class Kaden {
	String Name;
	static int Price;

void display() {
	System.out.println(Name);
	System.out.println(Price);
}
public String getName() {
	return Name;
}

public void setName(String Name) {
	this.Name = Name;
}

public static int getPrice() {
	return Price;
}

public static void setPrice(int Price) {
	Kaden.Price = Price;
}
}
