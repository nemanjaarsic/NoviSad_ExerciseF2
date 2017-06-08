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
	public void test_changeDirectionLeft_1()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveLeft();
		
		assertEquals("Vozilo menja smer kretanja na levo",
					 "(3, 3, W)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_changeDirectionRight_1()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveRight();
		
		assertEquals("Vozilo menja smer kretanja na desno",
					 "(3, 3, E)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_changeDirectionLeft_2()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveLeft();
		rover.moveLeft();
		
		assertEquals("Vozilo menja smer kretanja na levo",
					 "(3, 3, S)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_changeDirectionRight_2()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveRight();
		rover.moveRight();
		
		assertEquals("Vozilo menja smer kretanja na desno",
					 "(3, 3, S)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_fullRotationToTheLeft()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveLeft();
		rover.moveLeft();
		rover.moveLeft();
		rover.moveLeft();
		
		assertEquals("Vozilo pravi krug oko svoje ose na levo",
					 "(3, 3, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_fullRotationToTheRight()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveRight();
		rover.moveRight();
		rover.moveRight();
		rover.moveRight();
		
		assertEquals("Vozilo pravi krug oko svoje ose na desno",
					 "(3, 3, N)", rover.getFormatedCoorditates());
	}
	
	@Test
	public void test_fullRotationToTheLeftPlusOne()
	{
		PlanetExplorer rover = new PlanetExplorer(3,3,null);
		
		//Movement
		rover.moveLeft();
		rover.moveLeft();
		rover.moveLeft();
		rover.moveLeft();
		rover.moveLeft();
		
		assertEquals("Vozilo pravi krug oko svoje ose na levo i jos jednom na levo",
					 "(3, 3, W)", rover.getFormatedCoorditates());
	}
	
}
