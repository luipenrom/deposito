import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertEquals(tank.getDepositoNivel(),0,0);
	}

	@Test
	public void testGetDepositoMax() {

	}

	@Test
	public void testEstaVacio() {

	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(40.0,15.0);
		assertEquals(tank.getDepositoNivel(),25.0,0);
	}

	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(40.0,15.0);
		tank.fill(15);
		assertEquals(tank.getDepositoNivel(),25.0,0);
	}

	@Test
	public void testConsumir() {

	}

}
