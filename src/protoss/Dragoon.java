package protoss;

//오브젝트(객체)는 상태와 행동을 가진다.
public class Dragoon extends Protoss {
	public Dragoon() {
		this(100, 100);
	}
	
	//매개변수의 타입이 다르거나, 개수가 다르면 오버로딩
	public Dragoon(int st, int sh) {
		this.st = st;
		this.sh = sh;
		
		System.out.println("I had returned");
	}
	
	final String name = "드라군";
	int st; //체력
	int sh; //쉴드(보호막)
	static int attack = 20;
	static int armor = 1;
	
	@Override
	public String getName() {		
		return name;
	}

	@Override
	public int getSh() {		
		return sh;
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
	public void setSh(int sh) {
		this.sh = sh;
	}

	@Override
	public void setSt(int st) {
		this.st = st;
	}
}
