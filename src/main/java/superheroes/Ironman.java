package superheroes;

public class Ironman {
	
	private boolean fly;
	private int power;
	private String name;

	public int getPower() {
		return power;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getFly() {
		return fly;
	}
	
	public Ironman(String name) {
		this.fly = false;
		this.power = 100;
		this.name = name;
	}

	public void toggleFly() {
		fly = !fly;
		
	}

	public void shootRay() {
		power -= 1;
	}

	public void kick() {
		power -= 1;
	}
}
