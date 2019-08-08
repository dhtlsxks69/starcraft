package Zerg;

public class Chamber {
	//업그레이드 공격력
	public void upgradeAttack(){
		Hydra.attack++;
		Ultra.attack++;
	}
	//업그레이드 방어력
	public void upgradeArmor(){
		Hydra.armor++;
		Ultra.armor++;
	}
}
