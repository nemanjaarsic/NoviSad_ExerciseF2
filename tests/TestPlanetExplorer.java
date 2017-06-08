import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_mapFormation() {
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		assertEquals("Velicina mape i pozicije prepreka su:","(3, 3, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_moveForth()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		rover.moveForth();
		assertEquals("Vozilo se pomerilo napred za 1", "(3, 4, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_moveBack()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		rover.moveBack();
		assertEquals("Vozilo se pomerilo nazad za 1", "(3, 2, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_changeDirectionLeft()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		rover.moveLeft();
		assertEquals("Vozilo menja smer kretanja na levo",
					 "(3, 3, E)", rover.getFormatedCoorditates());
	}
}
