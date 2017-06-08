import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_mapFormation() {
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		assertEquals("Velicina mape i pozicije prepreka su:","(3, 3, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_moveFarvard()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		rover.moveForth();
		assertEquals("Vozilo se pomerilo za napred za 1", "(3, 4, N)", rover.getFormatedCoorditates());
	}
}
