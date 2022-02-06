import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,18.0);
		assertEquals(tank.getDepositoNivel(),18,0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(40.0,18.0);
		assertEquals(tank.getDepositoMax(),40,0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertTrue(tank.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,15.0);
		assertFalse(tank.estaLleno());
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,18.0);
		tank.fill(12);
		assertEquals(tank.getDepositoNivel(),30,0);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible tank = new DepositoCombustible(40.0,18.0);
		assertEquals(tank.getDepositoNivel(),18,0);
	}

}
