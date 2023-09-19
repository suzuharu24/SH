package Course56;

public class PoPocke extends PoSuper implements PoAction{
	
	private int Kotaichi;
	private String nicname;
	
	public void battle() {
		System.out.println("決闘開始ー！！");
	}
	
	public void recover() {
		
	}
	
	
	public int getKotaichi() {
		return Kotaichi;
	}
	public void setKotaichi(int Kotaichi) {
		this.Kotaichi = Kotaichi;
	}
	public String getNicname() {
		return nicname;
	}
	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

}
