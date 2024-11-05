package ar.edu.info.unlp.ejercicio24;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightMixTest {
	
	private MixingTank tank;
	private LightMix mixer;
	
	@BeforeEach
	public void setUp() {
		tank = new MixingTank();
		mixer = new LightMix();
	}
	
	@Test
	public void testSuccessful() {
		mixer.execute(tank);
		assertTrue(mixer.isDone());
	}
	
	@Test
	public void testFailure() {
		mixer.execute(tank);
		assertTrue(!mixer.isDone());
	}

}
