package Zerg;

public class Ultra extends Zerg{
	public Ultra() {
		this(100, 100);
	}
	
	//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
	public Ultra(int st, int sh) {
		this.st = st;
		this.sh = sh;
		
		System.out.println("��ň��������������");
	}
	
	final String name = "��Ʈ��";
	int st; //ü��
	int sh; //����(��ȣ��)
	static int attack = 30;
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
