package ar.edu.info.unlp.ejercicio24;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PurgeTest {
	
	private MixingTank tank;
	private Purge mixer;
	
	@BeforeEach
	public void setUp() {
		tank = new MixingTank();
		mixer = new Purge();
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
