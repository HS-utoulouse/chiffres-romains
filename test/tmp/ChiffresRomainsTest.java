package tmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
	ChiffresRomains c;

	@BeforeEach
	void init() {
		c = new ChiffresRomains();
	}

	@Test
	void ITER1() {
		assertEquals(c.toChiffresRomains(1), "I");
	}

	@Test
	void ITER2() {
		assertEquals(c.toChiffresRomains(2), "II");
		assertEquals(c.toChiffresRomains(3), "III");
	}

	@Test
	void ITER3() {
		assertThrows(IllegalArgumentException.class, () -> c.toChiffresRomains(0));
		assertThrows(IllegalArgumentException.class, () -> c.toChiffresRomains(40000));
	}

	@Test
	void ITER4() {
		assertEquals(c.toChiffresRomains(4), "IV");
	}

	@Test
	void ITER5() {
		assertEquals(c.toChiffresRomains(5), "V");
		assertEquals(c.toChiffresRomains(6), "VI");
		assertEquals(c.toChiffresRomains(7), "VII");
	}

	@Test
	void ITER6() {
		assertEquals(c.toChiffresRomains(9), "IX");
	}

	@Test
	void ITER7() {
		assertEquals(c.toChiffresRomains(30), "XXX");
	}

	@Test
	void ITER8() {
		assertEquals(c.toChiffresRomains(11), "XI");
		assertEquals(c.toChiffresRomains(34), "XXXIV");
	}
	
	@Test
	void ITER9() {
		assertEquals(c.toChiffresRomains(100), "C");
		assertEquals(c.toChiffresRomains(2000), "MM");
	}
}
