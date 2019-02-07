package superheroes;

public class Superman {
	
	private boolean fly;
	private int strangth;
	private String name;


	public int getStrangth() {
		return strangth;
	}

	public String getName() {
		return name;
	}
	
	public boolean getFly() {
		return fly;
	}
	
	public Superman(String name) {
		this.fly = false;
		this.strangth = 10;
		this.name = name;
	}
	
	public void toggleFly() {
		fly = !fly;

	}

	public void punch() {
		strangth -= 1;
		
	}


	public void kick() {
		strangth -= 1;
		
	}


}
