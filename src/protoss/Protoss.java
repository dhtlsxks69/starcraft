package protoss;

import starcraft.Starcraft;

//추상메소드를 가질 수 있다.
//일반메소드도 가질 수 있다.
//인터페이스가 가진 추상메소드를 구현하지 않아도 됨.
//어댑터의 용도로 많이 사용됨.
public abstract class Protoss implements Starcraft{
	public abstract int getSh();
	public abstract void setSh(int sh);

}
