package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaptianAmericaTest {

	CaptianAmerica testCaptianAmerica;
	
	@Test
	public void shouldBeAbleToJump() {
		testCaptianAmerica = new CaptianAmerica("Steve");
		
		int staminaBeforeJump = testCaptianAmerica.getStamina();
		testCaptianAmerica.jump();
		int staminaAfterJump = testCaptianAmerica.getStamina();
		
		assertEquals(staminaAfterJump, staminaBeforeJump -1);
	} 
	
	@Test
	public void shouldBeAbleToThrowSheild() {
		testCaptianAmerica = new CaptianAmerica("Steve");
		
		int staminaBeforeThrowSheild = testCaptianAmerica.getStamina();
		testCaptianAmerica.throwSheild();
		int staminaAfterThrowSheild = testCaptianAmerica.getStamina();
		
		assertEquals(staminaAfterThrowSheild, staminaBeforeThrowSheild -1);
	} 
	
	@Test
	public void shouldBeAbleToPunch() {
		testCaptianAmerica = new CaptianAmerica("Steve");
		
		int staminaBeforePunch = testCaptianAmerica.getStamina();
		testCaptianAmerica.punch();
		int staminaAfterPunch = testCaptianAmerica.getStamina();
		
		assertEquals(staminaAfterPunch, staminaBeforePunch -1);
	} 
	
	@Test
	public void shouldBeAbleToGetName() {
		testCaptianAmerica = new CaptianAmerica("Steve");
		
		assertEquals(testCaptianAmerica.getName(), "Steve");
		}
	
}
