package course32;

public class UseClass {

	public static void main(String[] args) {
		computer mypc=new computer("初期NAME","初期CPU",0,"初期GURABO",100);
		mypc.display();
		
		
		mypc.name="KOKURI MACHINE";
		mypc.cpu="intel core-i9 13900H";
		mypc.memory=16;
		mypc.gurabo="RTX4070";
		mypc.price=250000;
		mypc.display();
		
		int x=mypc.nebiki(500);
		System.out.println(x);
		
		int modori=mypc.chonebiki(2000);
		System.out.println(modori);
		

}
}