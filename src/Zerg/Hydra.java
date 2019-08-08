package Zerg;

public class Hydra extends Zerg{
	public Hydra() {
		this(100, 100);
	}
	
	//매개변수의 타입이 다르거나, 개수가 다르면 오버로딩
	public Hydra(int st, int sh) {
		this.st = st;
		this.sh = sh;
		
		System.out.println("흐읗ㅇ흐으긍흐으흥흐");
	}
	
	final String name = "히드라";
	int st; //체력
	int sh; //쉴드(보호막)
	static int attack = 10;
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
