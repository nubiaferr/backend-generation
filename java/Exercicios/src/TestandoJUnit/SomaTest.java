package TestandoJUnit;

import junit.framework.TestCase;

public class SomaTest extends TestCase {
	
	Soma exemplo1 = new Soma(); //instanciei o objeto 
		
	public void testSomar() {
		int somatorio = exemplo1.somar(10, 10);
		
		assertEquals(20, somatorio);
		assertEquals(10, somatorio);
	}

}
