import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TesteValores {
	
	private Valores teste = new Valores();
	private int n = 1;
	
	@Before
	public void setUp() throws Exception {
		System.out.println("Inserindo números 2, 4, 6, 8 e 10.");
		for (int i = 2; i <= 10; i+=2){
			teste.inserir(i);
		}
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Iniciando o " + n +"° Teste");
	}

	@Test
	public void testeBasico() {
		assertEquals(5, teste.size());
		assertEquals(10, teste.bigger());
		assertEquals(2, teste.lower());
		assertEquals(6, teste.media(), 0);
		n++;
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
		n+=2;
	}
	
	@Test
	public void testeApagar(){
		assertEquals(10, teste.apagar(4));
		assertEquals(8, teste.apagar(3));
		assertEquals(4, teste.apagar(1));
		assertEquals(2, teste.apagar(0));
		assertEquals(6, teste.apagar(0));
		assertEquals(-1, teste.apagar(4));
		assertEquals(0, teste.size());
		assertEquals(-1, teste.bigger());
		assertEquals(-1, teste.lower());
		assertEquals(0, teste.media(), 0);
	}

}
