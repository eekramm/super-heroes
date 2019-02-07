package superheroes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FlashTest {

	Flash testFlash;

	@Test
	public void shouldBeAbleToRun() {
		testFlash = new Flash("Barry");

		testFlash.toggleRun();

		Assert.assertEquals(true, testFlash.getRun());
	}


	@Test
	public void shouldBeAbleToStopRunning() {
		testFlash = new Flash("Barry");

		testFlash.toggleRun();
		testFlash.toggleRun();

		assertEquals(false, testFlash.getRun());
	}

	@Test
	public void shouldBeAbleToPunch() {
		testFlash = new Flash("Barry");

		int staminaBeforePunch = testFlash.getStamina();
		testFlash.punch();
		int staminaAfterPunch = testFlash.getStamina();

		assertEquals(staminaAfterPunch, staminaBeforePunch - 1);
	}

	@Test
	public void shouldBeAbleToKick() {
		testFlash = new Flash("Barry");

		int staminaBeforeKick = testFlash.getStamina();
		testFlash.kick();
		int staminaAfterKick = testFlash.getStamina();

		assertEquals(staminaAfterKick, staminaBeforeKick - 1);
	}

	@Test
	public void shouldBeAbleToGetName() {
		testFlash = new Flash("Barry");

		assertEquals(testFlash.getName(), "Barry");
	}

}
