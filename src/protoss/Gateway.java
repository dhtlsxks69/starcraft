package protoss;

public class Gateway {
	//å�� (���� ����, ���, ��ũ���÷� ����)
	public Zealot makeZealot(){
		return new Zealot();
	}
	
	public Dragoon makeDragoon(){
		return new Dragoon();
	}
	
	public DarkTempler makeDarkTempler(){
		return new DarkTempler();
	}
}
