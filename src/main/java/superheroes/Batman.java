package superheroes;

public class Batman {

	private int batarangs;
	private int stamina;
	private String name;
	
	public int getBatarangs() {
		return batarangs;
	}
	
	public int getStamina() {
		return stamina;
	}
	
	public String getName() {
		return name;
	}
	
	public Batman(String name) {
		this.batarangs = 10;
		this.stamina = 100;
		this.name = name;
	}

	public void throwBatarang() {
		batarangs -= 1;
		
	}

	public void punch() {
		stamina -=1;
	}

	public void kick() {
		stamina -=1;
	}



}
