package terran;

public class FireBat extends Terran{
	public FireBat() {
		this(100);
	}
	
	//매개변수의 타입이 다르거나, 개수가 다르면 오버로딩
	public FireBat(int st) {
		this.st = st;
		
		System.out.println("불 필요하신가요?");
	}
	
	final String name = "파이어뱃";
	int st; //체력
	static int attack = 8;
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
