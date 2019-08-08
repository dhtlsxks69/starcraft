package Zerg;

import terran.Barrack;
import terran.EngeeniaringBay;
import terran.FireBat;
import terran.Marine;
import terran.TerranApp;

public class ZergApp {
	
	//누가, 누구를
	public static void attack(Zerg u1, Zerg u2){
		//히드라 공격력 : 10
		//울트라 공격력 : 30
		//히드라, 울트라 방어력 : 1
		int damage = u1.getAttack()-u2.getArmor(); 
		u2.setSt(u2.getSt() - damage);
	}
	
	public static void printUnit(Zerg u){
		System.out.println(u.getName() + "의 체력은 " + u.getSt());
	}

	public static void main(String[] args) {
		//1. 배럭생성
		Hatchery hatchery = new Hatchery();
		
		//2. 히드라 2마리 생성 h1, h2
		Hydra h1 = hatchery.makeHydra();
		Hydra h2 = hatchery.makeHydra();
		
		//3. 히드라 2마리 생성 ult1, ult2
		Ultra ult1 = hatchery.makeUltra();
		Ultra ult2 = hatchery.makeUltra();
		
		//4. ult1, h2 전투
		ZergApp.attack(ult1, h2);
		
		//5. ult1, h2 전투
		ZergApp.attack(h1, ult1);
		
		//6. h2의 체력확인
		ZergApp.printUnit(h2);
		ZergApp.printUnit(ult1);
		
		//7. Chamber 건설
		Chamber chamber = new Chamber();
		
		//8. 공격력 업그레이드
		chamber.upgradeAttack();
		
		//9. 방어력 업그레이드
		chamber.upgradeArmor();
		
		//10. 울트라의 공격력 방어력 확인
		System.out.println("울트라의 공격력" + ult1.getAttack());
		System.out.println("울트라의 방어력" + ult1.getArmor());
	}

}
