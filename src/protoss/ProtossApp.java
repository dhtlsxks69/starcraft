package protoss;

public class ProtossApp {
	
	//����, ������
	public static void attack(Protoss u1, Protoss u2){
		//���� ���ݷ� : 16
		//��� ���� : 1
		int damage = u1.getAttack()-u2.getArmor(); //15
		u2.setSh(u2.getSh() - damage);
	}
	
	public static void printUnit(Protoss u){
		System.out.println(u.getName() + "�� ����� " + u.getSh());
	}
	
	//����!!
	public static void main(String[] args) {
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot(); //���� ������
		Zealot z2 = gate1.makeZealot(); //���� ������
		
		Dragoon d1 = gate1.makeDragoon(); //��� ������
		Dragoon d2 = gate1.makeDragoon(); //��� ������
		
		DarkTempler dak1 = gate1.makeDarkTempler(); //��ũ���÷� ������
		
		ProtossApp.attack(z1, d1);
		ProtossApp.printUnit(d1);
		
		ProtossApp.attack(d1, z1);
		ProtossApp.printUnit(z1);
		
		ProtossApp.attack(z1, z2);
		ProtossApp.printUnit(z2);
		
		ProtossApp.attack(z1, dak1);
		ProtossApp.printUnit(dak1);
		
		//���� �Ǽ�
		Porge porge = new Porge();
		
		//���׷��̵� ���ݷ�
		porge.upgradeAttack();
		
		//���׷��̵� ����
		porge.upgradeArmor();
		
		//��� ���ݷ�
		System.out.println("��� ���ݷ�" + d1.getAttack());
		
		//��� ����
		Dragoon d3 = new Dragoon();
		System.out.println("��� ����" + d3.getArmor());
	}
}
