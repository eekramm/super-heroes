package superheroes;

public class Thor {
	
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
	
	public Thor(String name) {
		this.fly = false;
		this.strangth = 100;
		this.name = name;
	}

	public void toggleFly() {
		fly = !fly;
	}

	public void throwHammer() {
		strangth -= 1;
	}

	public void punch() {
		strangth -= 1;
	}




}
