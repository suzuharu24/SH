package course54_55;

public class StudentControll {

	public static void main(String[] args) {
		
		student me=new student(14,"鈴木陽哉");
		student tonari=new student(18,"土屋翔太");
		
		student[]mymen=new student[2];
		mymen[0]=tonari;
		mymen[1]=me;
		
		System.out.println(mymen[1].getName());
		mymen[0].setName("誰か");
		
	}

}
