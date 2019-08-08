package starcraft;

import Zerg.Hatchery;
import Zerg.Hydra;
import Zerg.Zerg;
import protoss.Gateway;
import protoss.Protoss;
import protoss.Zealot;
import terran.Barrack;
import terran.Marine;
import terran.Terran;

public class StarGame {
	
	//마린 -> 히드라 (히드라 -> 마린)
	public static void attack(Starcraft u1, Starcraft u2){
		int damage = u1.getAttack() - u2.getArmor();
		
		//try-catch는 실행시 오류가 생길때 사용
		try {
			Protoss p = (Protoss)u2;
			p.setSh(((Protoss)u2).getSh() - damage);
		} catch (Exception e) {
			u2.setSt(u2.getSt() - damage);
		}
		
	}
	
	public static void main(String[] args){
		Barrack ba1 = new Barrack();
		Marine m1 = ba1.makeMarine();
		
		Hatchery ht1 = new Hatchery();
		Hydra h1 = ht1.makeHydra();
		
		Gateway g1 = new Gateway();
		Zealot z1 = g1.makeZealot();
		
		attack(m1, h1);		
		System.out.println(h1.getSt());
		
		attack(h1, m1);		
		System.out.println(m1.getSt());
		
		attack(m1, z1);		
		System.out.println(z1.getSh());
	}
}
