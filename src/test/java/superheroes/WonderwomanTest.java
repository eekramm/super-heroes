package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WonderwomanTest {

	Wonderwoman testWonderwoman;

	@Test
	public void shouldBeAbleToFly() {
		testWonderwoman = new Wonderwoman("Diana");

		testWonderwoman.toggleFly();

		assertEquals(true, testWonderwoman.getFly());
	}

	@Test
	public void shouldBeAbleToStopFlying() {
		testWonderwoman = new Wonderwoman("Diana");

		testWonderwoman.toggleFly();
		testWonderwoman.toggleFly();

		assertEquals(false, testWonderwoman.getFly());
	}

	@Test
	public void shouldBeAbleToPunch() {
		testWonderwoman = new Wonderwoman("Diana");

		int strangthBeforePunch = testWonderwoman.getStrangth();
		testWonderwoman.punch();
		int strangthAfterPunch = testWonderwoman.getStrangth();

		assertEquals(strangthAfterPunch, strangthBeforePunch - 1);
	}
	
	@Test
	public void shouldBeAbleToKick() {
		testWonderwoman = new Wonderwoman("Diana");
		
		int strangthBeforeKick = testWonderwoman.getStrangth();
		testWonderwoman.kick();
		int strangthAfterKick = testWonderwoman.getStrangth();
		
		
		assertEquals(strangthAfterKick, strangthBeforeKick - 1);
	}
	
	@Test
	public void shouldBeAbleToGetName() {
		testWonderwoman = new Wonderwoman("Diana");
		
		assertEquals(testWonderwoman.getName(), "Diana");
	}

}
