package JUnitTests;

import static org.junit.Assert.*;
import org.junit.Test;



import PGPpackage.PGPclass;

public class PGPTest {

	@Test
	public void test() {
		PGPclass q;
		
		q = new PGPclass(100, 40, 50);
		assertEquals(40, q.TotalFuelConsumption, 0);
		assertEquals(2000, q.TotalSum, 0);

	}

}
