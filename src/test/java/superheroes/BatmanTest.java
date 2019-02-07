package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BatmanTest {
	
	Batman testBatman;
	
	@Test
	public void shouldBeAbleToThrowBatarang() {
		testBatman = new Batman("Bruce");
		
		int numberOfBatarangsBerforeThrow = testBatman.getBatarangs();
		testBatman.throwBatarang();
		int numberOfBatarangsAfterThrow = testBatman.getBatarangs();
		
		assertEquals(numberOfBatarangsAfterThrow, numberOfBatarangsBerforeThrow -1);
		
	}
	
	@Test
	public void shouldBeAbleToPunch() {
		testBatman = new Batman ("Bruce");
		
		int staminaBeforePunch = testBatman.getStamina();
		testBatman.punch();
		int staminaAfterPunch = testBatman.getStamina();
		
		assertEquals(staminaAfterPunch, staminaBeforePunch - 1);
		
	}
	
	@Test
	public void shouldBeAbleToKick() {
		testBatman = new Batman ("Bruce");
		
		int staminaBeforeKick = testBatman.getStamina();
		testBatman.kick();
		int staminaAfterKick = testBatman.getStamina();
		
		assertEquals(staminaAfterKick, staminaBeforeKick -1);
	}
	
	@Test
	public void shouldBeAbleToGetName() {
		testBatman = new Batman ("Bruce");
		
		assertEquals(testBatman.getName(), "Bruce");
	}

}
