package tmp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChiffresRomainsTest {
	ChiffresRomains c;
	
	@BeforeEach
	void init(){
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

}
