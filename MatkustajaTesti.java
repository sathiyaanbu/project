package fi.agileo.testing;
import static org.junit.Assert.assertEquals;
import  org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)

public class MatkustajaTesti {
	
	@Mock
	Profiili mockProfiili;

	@Test(expected=LianVanhaException.class)
	public void testVanhenePoikkeus() throws LianVanhaException {
		Matkustaja testattava = new Matkustaja(mockProfiili,25);
		
		testattava.vanhene(99);
	}
	@Test
	public void testVanhene() throws LianVanhaException {
		Matkustaja testattava = new Matkustaja(mockProfiili,30);
		int paluuArva;
		paluuArva = testattava.vanhene(30);
		
		assertEquals(60,paluuArva);
	}
	
		
	}
	


