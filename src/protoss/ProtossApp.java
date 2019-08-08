package protoss;

public class ProtossApp {
	
	//누가, 누구를
	public static void attack(Protoss u1, Protoss u2){
		//질럿 공격력 : 16
		//드라군 방어력 : 1
		int damage = u1.getAttack()-u2.getArmor(); //15
		u2.setSh(u2.getSh() - damage);
	}
	
	public static void printUnit(Protoss u){
		System.out.println(u.getName() + "의 쉴드는 " + u.getSh());
	}
	
	//전장!!
	public static void main(String[] args) {
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot(); //질럿 생성됨
		Zealot z2 = gate1.makeZealot(); //질럿 생성됨
		
		Dragoon d1 = gate1.makeDragoon(); //드라군 생성됨
		Dragoon d2 = gate1.makeDragoon(); //드라군 생성됨
		
		DarkTempler dak1 = gate1.makeDarkTempler(); //다크템플러 생성됨
		
		ProtossApp.attack(z1, d1);
		ProtossApp.printUnit(d1);
		
		ProtossApp.attack(d1, z1);
		ProtossApp.printUnit(z1);
		
		ProtossApp.attack(z1, z2);
		ProtossApp.printUnit(z2);
		
		ProtossApp.attack(z1, dak1);
		ProtossApp.printUnit(dak1);
		
		//포지 건설
		Porge porge = new Porge();
		
		//업그레이드 공격력
		porge.upgradeAttack();
		
		//업그레이드 방어력
		porge.upgradeArmor();
		
		//드라군 공격력
		System.out.println("드라군 공격력" + d1.getAttack());
		
		//드라군 방어력
		Dragoon d3 = new Dragoon();
		System.out.println("드라군 방어력" + d3.getArmor());
	}
}
