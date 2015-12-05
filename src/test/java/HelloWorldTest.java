import static org.junit.Assert.*;

import org.junit.Test;


public class HelloWorldTest {

	@Test
	public void deve_dizer_ola_mundo() throws Exception {
		HelloWorld sut = new HelloWorld();

		String resultado = sut.dizerOi();

		assertEquals("Oi", resultado);
	}
}
