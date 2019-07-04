package protoss;

public class ProtossApp {
	
	//누가, 누구를
	public static void attack(Zealot u1, Dragoon u2){
		//질럿 공격력 : 16
		//드라군 방어력 : 1
		int damage = u1.attack-u2.armor; //15
		u2.sh = u2.sh - damage;
	}
	
	//누가, 누구를
	public static void attack(Dragoon u1, Zealot u2){
		//드라군 공격력 : 20
		//질럿 방어력 : 1
		int damage = u1.attack-u2.armor; //19
		u2.sh = u2.sh - damage;
	}
	
	//누가, 누구를
	public static void attack(Zealot u1, Zealot u2){
		//질럿 공격력 : 16
		//질럿 방어력 : 1
		int damage = u1.attack-u2.armor; //15
		u2.sh = u2.sh - damage;
	}
	
	public static void printUnit(Dragoon u2){
		System.out.println("드라군의 쉴드는 " + u2.sh);
	}
	
	public static void printUnit(Zealot u2){
		System.out.println("질럿의 쉴드는 " + u2.sh);
	}
	
	public static void main(String[] args) {
		Gateway gate1 = new Gateway();
		Zealot z1 = gate1.makeZealot(); //질럿 생성됨
		Zealot z2 = gate1.makeZealot(); //질럿 생성됨
		
		Dragoon d1 = gate1.makeDragoon(); //드라군 생성됨
		Dragoon d2 = gate1.makeDragoon(); //드라군 생성됨
		
		ProtossApp.attack(z1, d1);
		ProtossApp.printUnit(d1);
		
		ProtossApp.attack(d1, z1);
		ProtossApp.printUnit(z1);
		
		ProtossApp.attack(z1, z2);
		ProtossApp.printUnit(z2);
	}
}
