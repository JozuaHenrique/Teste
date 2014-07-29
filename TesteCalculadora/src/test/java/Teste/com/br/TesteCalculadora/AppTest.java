package Teste.com.br.TesteCalculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	App app = null;
	
	
	@Before
	public void setUp() throws Exception {
		app = new App();
		
	}

	@After
	public void tearDown() throws Exception {
		app = null;
	}
	

	@Test
	public void test() {
		assertEquals(5,app.soma(3, 2));
		
	}
	
//	@Test
//	public void testFalho(){
//		assertNotEquals(5,app.soma(3, 3));
//	}
//	
	
	@Test
	public void testFalho(){
		assertEquals(5,app.soma(3, 3));
		
	}
}
