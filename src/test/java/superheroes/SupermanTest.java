package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SupermanTest {

	Superman testSuperman;

	@Test
	public void shouldBeAbleToFly() {
		testSuperman = new Superman("Clark");

		testSuperman.toggleFly();
		assertEquals(true, testSuperman.getFly());

	}

	@Test
	public void shouldBeAbleToStopFlying() {
		testSuperman = new Superman("Clark");

		testSuperman.toggleFly();
		testSuperman.toggleFly();

		assertEquals(false, testSuperman.getFly());
	}

	@Test
	public void shouldBeAbleToPunch() {
		testSuperman = new Superman("Clark");
		
		int strangthBeforePunch = testSuperman.getStrangth();
		testSuperman.punch();
		int strangthAfterPunch = testSuperman.getStrangth();
		
		assertEquals(strangthAfterPunch, strangthBeforePunch -1);

	}
	
	@Test
	public void shouldBeAbleToKick() {
		testSuperman = new Superman ("Clark");
		
		int strangthBeforeKick = testSuperman.getStrangth();
		testSuperman.kick();
		int strangthAfterKick = testSuperman.getStrangth();
		
		assertEquals(strangthAfterKick, strangthBeforeKick -1);
	}
	
	@Test
	public void shouldBeAbleToGetName() {
		testSuperman = new Superman ("Clark");
		
		assertEquals(testSuperman.getName(), "Clark");
	}

}
