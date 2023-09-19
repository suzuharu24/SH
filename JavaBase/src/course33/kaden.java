package course33;

public class kaden {
	private String name;
	private int price;
	private String category;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//もし設定予定のパラメータが「マウス」なら
		//在庫切れ商品のためNGとする。
		if(name.equals("マウス")) {
			this.name="設定NG";
		}else {
			//そうでないなら受け取った名前を設定
			this.name=name;
		}
		
	}
	
	public int getprice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	
}
	public String getcategory() {
		return category;
	}
	
	public void setcategory(String category) {
		if(category.equals("大型")) {
			this.category=category;
		}else {
			this.category="設定NG";
		}
		
	}
	
	
	
	
	
}