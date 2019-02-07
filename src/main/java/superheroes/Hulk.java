package superheroes;

public class Hulk {
	
	private int anger;
	private String name;

	public int getAnger() {
		return anger;
	}
	
	public String getName() {
		return name;
	}
	
	public Hulk(String name) {
		this.anger = 100;
		this.name = name;
	}

	public void jump() {
		anger -= 1;
	}

	public void hulkSmash() {
		anger -= 1;
	}

	public void punch() {
		anger -= 1;
		
	}




}
