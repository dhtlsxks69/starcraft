package terran;

public class TerranApp {
	
	//누가, 누구를
	public static void attack(Terran u1, Terran u2){
		//마린 공격력 : 5
		//파이어뱃 공격력 : 8
		//마린, 파이어뱃 방어력 : 1
		int damage = u1.getAttack()-u2.getArmor(); 
		u2.setSt(u2.getSt() - damage);
	}
	
	public static void printUnit(Terran u){
		System.out.println(u.getName() + "의 체력은 " + u.getSt());
	}
	
	//전장!!
	public static void main(String[] args) {
		//1. 배럭생성
		Barrack barrack = new Barrack();
		
		//2. 마린 2마리 생성 m1, m2
		Marine m1 = barrack.makeMarine();
		Marine m2 = barrack.makeMarine();
		
		//3. 파이어뱃 2마리 생성 f1, f2
		FireBat f1 = barrack.makeFireBat();
		FireBat f2 = barrack.makeFireBat();
		
		//4. m1, f2 전투
		TerranApp.attack(m1, f2);
		
		//5. m1, f2 전투
		TerranApp.attack(f2, m1);
		
		//6. f2의 체력확인
		TerranApp.printUnit(f2);
		TerranApp.printUnit(m1);
		
		//7. EngeeniaringBay 건설
		EngeeniaringBay engeeniaringbay = new EngeeniaringBay();
		
		//8. 공격력 업그레이드
		engeeniaringbay.upgradeAttack();
		
		//9. 방어력 업그레이드
		engeeniaringbay.upgradeArmor();
		
		//10. 마린의 공격력 방어력 확인
		System.out.println("마린의 공격력" + m1.getAttack());
		System.out.println("마린의 방어력" + m1.getArmor());
	}
}
