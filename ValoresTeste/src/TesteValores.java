import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteValores {
	
	private Valores teste = new Valores();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Inserindo números 2, 4, 6, 8 e 10.");
		for (int i = 2; i <= 10; i+=2){
			teste.inserir(i);
		}
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testeBasico() {
		assertEquals(5, teste.size());
		assertEquals(10, teste.bigger());
		assertEquals(2, teste.lower());
		assertEquals(6, teste.media(), 0);
	}
	
	@Test
	public void testeInseir(){
		assertEquals(true, teste.inserir(260));
		assertEquals(false, teste.inserir(-1));
		assertEquals(false, teste.inserir(0));
		assertEquals(true, teste.inserir(1));
		assertEquals(true, teste.inserir(22));
		assertEquals(true, teste.inserir(405));
		assertEquals(true, teste.inserir(26));
		assertEquals(false, teste.inserir(19));
		assertEquals(10, teste.size());
		assertEquals(405, teste.bigger());
		assertEquals(1, teste.lower());
		assertEquals(74.4, teste.media(), 0);
	}
	
	@Test
	public void testeApagar(){
		int[] valores = {2,4,6,8,10};
		for (int i = 4; i >= 0; i--){
			assertEquals(valores[i], teste.apagar(i));
		}
		assertEquals(-1, teste.apagar(3));
		assertEquals(-1, teste.apagar(0));
		assertEquals(0, teste.size());
		assertEquals(-1, teste.bigger());
		assertEquals(-1, teste.lower());
		assertEquals(0, teste.media(), 0);
	}

}
