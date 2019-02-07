package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IronmanTest {
	
	Ironman testIronman;
	
	@Test
	public void shouldBeAbleToFly() {
		testIronman = new Ironman("Tony");
		
		testIronman.toggleFly();
		
		assertEquals(true, testIronman.getFly());
	}
	
	@Test
	public void shouldBeAbleToStopFlying() {
		testIronman = new Ironman("Tony");
		
		testIronman.toggleFly();
		testIronman.toggleFly();
		
		assertEquals(false, testIronman.getFly());
	}
	
	@Test
	public void shouldBeAbleToShootRay() {
		testIronman = new Ironman("Tony");
		
		int powerBeforeShootRay = testIronman.getPower();
		testIronman.shootRay();
		int powerAfterShootRay = testIronman.getPower();
		
		assertEquals(powerAfterShootRay, powerBeforeShootRay -1);
	}
	
	@Test
	public void shouldBeAbleToKick() {
		testIronman = new Ironman("Tony");
		
		int powerBeforeKick = testIronman.getPower();
		testIronman.kick();
		int powerAfterKick = testIronman.getPower();
		
		assertEquals(powerAfterKick, powerBeforeKick -1);
	}
	
	@Test
	public void shouldBeAbleToGetName() {
		testIronman = new Ironman("Tony");
		
		assertEquals(testIronman.getName(), "Tony");
	}

}
