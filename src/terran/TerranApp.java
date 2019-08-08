package terran;

public class TerranApp {
	
	//����, ������
	public static void attack(Terran u1, Terran u2){
		//���� ���ݷ� : 5
		//���̾�� ���ݷ� : 8
		//����, ���̾�� ���� : 1
		int damage = u1.getAttack()-u2.getArmor(); 
		u2.setSt(u2.getSt() - damage);
	}
	
	public static void printUnit(Terran u){
		System.out.println(u.getName() + "�� ü���� " + u.getSt());
	}
	
	//����!!
	public static void main(String[] args) {
		//1. �跰����
		Barrack barrack = new Barrack();
		
		//2. ���� 2���� ���� m1, m2
		Marine m1 = barrack.makeMarine();
		Marine m2 = barrack.makeMarine();
		
		//3. ���̾�� 2���� ���� f1, f2
		FireBat f1 = barrack.makeFireBat();
		FireBat f2 = barrack.makeFireBat();
		
		//4. m1, f2 ����
		TerranApp.attack(m1, f2);
		
		//5. m1, f2 ����
		TerranApp.attack(f2, m1);
		
		//6. f2�� ü��Ȯ��
		TerranApp.printUnit(f2);
		TerranApp.printUnit(m1);
		
		//7. EngeeniaringBay �Ǽ�
		EngeeniaringBay engeeniaringbay = new EngeeniaringBay();
		
		//8. ���ݷ� ���׷��̵�
		engeeniaringbay.upgradeAttack();
		
		//9. ���� ���׷��̵�
		engeeniaringbay.upgradeArmor();
		
		//10. ������ ���ݷ� ���� Ȯ��
		System.out.println("������ ���ݷ�" + m1.getAttack());
		System.out.println("������ ����" + m1.getArmor());
	}
}
