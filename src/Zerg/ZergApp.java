package Zerg;

import terran.Barrack;
import terran.EngeeniaringBay;
import terran.FireBat;
import terran.Marine;
import terran.TerranApp;

public class ZergApp {
	
	//����, ������
	public static void attack(Zerg u1, Zerg u2){
		//����� ���ݷ� : 10
		//��Ʈ�� ���ݷ� : 30
		//�����, ��Ʈ�� ���� : 1
		int damage = u1.getAttack()-u2.getArmor(); 
		u2.setSt(u2.getSt() - damage);
	}
	
	public static void printUnit(Zerg u){
		System.out.println(u.getName() + "�� ü���� " + u.getSt());
	}

	public static void main(String[] args) {
		//1. �跰����
		Hatchery hatchery = new Hatchery();
		
		//2. ����� 2���� ���� h1, h2
		Hydra h1 = hatchery.makeHydra();
		Hydra h2 = hatchery.makeHydra();
		
		//3. ����� 2���� ���� ult1, ult2
		Ultra ult1 = hatchery.makeUltra();
		Ultra ult2 = hatchery.makeUltra();
		
		//4. ult1, h2 ����
		ZergApp.attack(ult1, h2);
		
		//5. ult1, h2 ����
		ZergApp.attack(h1, ult1);
		
		//6. h2�� ü��Ȯ��
		ZergApp.printUnit(h2);
		ZergApp.printUnit(ult1);
		
		//7. Chamber �Ǽ�
		Chamber chamber = new Chamber();
		
		//8. ���ݷ� ���׷��̵�
		chamber.upgradeAttack();
		
		//9. ���� ���׷��̵�
		chamber.upgradeArmor();
		
		//10. ��Ʈ���� ���ݷ� ���� Ȯ��
		System.out.println("��Ʈ���� ���ݷ�" + ult1.getAttack());
		System.out.println("��Ʈ���� ����" + ult1.getArmor());
	}

}
