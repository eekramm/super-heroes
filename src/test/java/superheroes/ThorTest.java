package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ThorTest {

	Thor testThor;

	@Test
	public void shouldBeAbleToFly() {
		testThor = new Thor("Thor");

		testThor.toggleFly();

		assertEquals(true, testThor.getFly());
	}

	@Test
	public void shouldBeAbleToStopFlying() {
		testThor = new Thor("Thor");

		testThor.toggleFly();
		testThor.toggleFly();

		assertEquals(false, testThor.getFly());
	}

	@Test
	public void shouldBeAbleToThrowHammer() {
		testThor = new Thor("Thor");

		int strangthBeforeThrowingHammer = testThor.getStrangth();
		testThor.throwHammer();
		int strangthAfterThrowingHammer = testThor.getStrangth();

		assertEquals(strangthAfterThrowingHammer, strangthBeforeThrowingHammer - 1);
	}

	@Test
	public void shouldBeAbleToPunch() {
		testThor = new Thor("Thor");

		int strangthBeforePunch = testThor.getStrangth();
		testThor.punch();
		int strangthAfterPunch = testThor.getStrangth();

		assertEquals(strangthAfterPunch, strangthBeforePunch - 1);
	}

	@Test
	public void shouldBeAbleToGetName() {
		testThor = new Thor("Thor");

		assertEquals(testThor.getName(), "Thor");
	}
}
