import static org.junit.Assert.*;
import org.junit.Test;

public class ListaTestUnit {

  @Test
  public void testListaCreada() throws Exception {


    final Lista lista = new Lista();

    assertEquals(0, lista.getTamanio());

  }
 

  @Test
  public void testListaConElementos() throws Exception {

    final Lista lista = new Lista();

    lista.agregarAlFinal("Martin");
	lista.agregarAlFinal("Agustina");
	lista.agregarAlFinal("Cristian");
	
    assertEquals(3, lista.getTamanio());

  }

}
