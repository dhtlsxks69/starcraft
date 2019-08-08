package protoss;

//������Ʈ(��ü)�� ���¿� �ൿ�� ������.
public class DarkTempler extends Protoss {
	public DarkTempler() {
		this(100, 100);
	}
	
	//�Ű������� Ÿ���� �ٸ��ų�, ������ �ٸ��� �����ε�
	public DarkTempler(int st, int sh) {
		this.st = st;
		this.sh = sh;
		
		System.out.println("Adun Touridus");
	}
	
	final String name = "��ũ���÷�";
	int st; //ü��
	int sh; //����(��ȣ��)
	static int attack = 40;
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
