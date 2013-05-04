package br.com.ismael;

import org.junit.Test;
import br.com.ismael.jogo.Jogo;

public class ConsultaJogoImplTest {

  @Test
  public void testSayHi() {
    ConsultaJogoImpl helloWorldImpl = new ConsultaJogoImpl();
    Jogo response = helloWorldImpl.consultaJogo("Galo", "Cruzeiro", "Belo Horizonte");
    System.out.println(response.getResultado());
  }
}
