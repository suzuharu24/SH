package course31;

public class Books{
	
	String name;
	int page;
	String author;
	
	public Books(String n, int page, String a) {
		name=n;
		page=page;
		author=a;

	}
	void display() {
		System.out.println(name);
		System.out.println(page);
		System.out.println(author);
		
	}


}
