package superheroes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HulkTest {
	
	Hulk testHulk;
	
	@Test
	public void shouldBeAbleToJump() {
		testHulk = new Hulk("David");
		
		int staminaBeforeJump = testHulk.getAnger();
		testHulk.jump();
		int staminaAfterJump = testHulk.getAnger();
		
		assertEquals(staminaAfterJump, staminaBeforeJump - 1);
	}
	
	@Test
	public void shouldBeAbleHulkSmash() {
		testHulk = new Hulk("David");
		
		int staminaBeforeHulkSmash = testHulk.getAnger();
		testHulk.hulkSmash();
		int staminaAfterHulkSmash = testHulk.getAnger();
		
		assertEquals(staminaAfterHulkSmash, staminaBeforeHulkSmash - 1);
	}
	
	@Test
	public void shouldBeAbleToPunch() {
		testHulk = new Hulk("David");
		
		int staminaBeforePunch = testHulk.getAnger();
		testHulk.punch();
		int staminaAfterJump = testHulk.getAnger();
		
		assertEquals(staminaAfterJump, staminaBeforePunch - 1);
	}
	
	@Test
	public void shouldBeAbleToGetName() {
		testHulk = new Hulk("David");
		
		assertEquals(testHulk.getName(), "David");
	}

}
