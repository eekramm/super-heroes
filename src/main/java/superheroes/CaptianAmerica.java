package superheroes;

public class CaptianAmerica {

	private int stamina;
	private String name;
	
	public int getStamina() {
		return stamina;
	}
	
	public String getName() {
		return name;
	}
	
	public CaptianAmerica(String name) {
		this.stamina = 100;
		this.name = name;
	}

	public void jump() {
		stamina -= 1;
	}

	public void throwSheild() {
		stamina -= 1;
	}

	public void punch() {
		stamina -= 1;
	}



}
