package protoss;

public class Gateway {
	//책임 (질럿 생성, 드라군, 다크템플러 생성)
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
