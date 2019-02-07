package superheroes;

public class Flash {
	
	private boolean run;
	private int stamina;
	private String name;

	public int getStamina() {
		return stamina;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean getRun() {
		return run;
	}
	
	public Flash(String name) {
		this.run = false;
		this.stamina = 100;
		this.name = name;
	}

	public void toggleRun() {
		run = !run;
	}

	public void punch() {
		stamina -= 1;
	}

	public void kick() {
		stamina -= 1; 
	}




}
