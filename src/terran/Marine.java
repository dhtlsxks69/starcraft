package terran;

public class Marine extends Terran{
	public Marine() {
		this(100);
	}
	
	//매개변수의 타입이 다르거나, 개수가 다르면 오버로딩
	public Marine(int st) {
		this.st = st;
		
		System.out.println("한판 붙어볼까요!");
	}
	
	final String name = "마린";
	int st; //체력
	static int attack = 5;
	static int armor = 1;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSt() {
		return st;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getArmor() {
		return armor;
	}

	@Override
	public void setSt(int st) {
		this.st = st;
	}
}
