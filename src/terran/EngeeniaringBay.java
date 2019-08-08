package terran;

public class EngeeniaringBay {
	//업그레이드 공격력
	public void upgradeAttack(){
		FireBat.attack++;
		Marine.attack++;
	}
	//업그레이드 방어력
	public void upgradeArmor(){
		FireBat.armor++;
		Marine.armor++;
	}
}
