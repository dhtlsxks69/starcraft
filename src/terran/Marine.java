package terran;

public class Marine extends Terran{
	public Marine() {
		this(100);
	}
	
	//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
	public Marine(int st) {
		this.st = st;
		
		System.out.println("���� �پ���!");
	}
	
	final String name = "����";
	int st; //ü��
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
