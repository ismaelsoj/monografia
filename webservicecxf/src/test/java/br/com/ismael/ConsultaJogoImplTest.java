package br.com.ismael;

import org.junit.Test;
import br.com.ismael.Jogo;

public class ConsultaJogoImplTest {

  @Test
  public void testSayHi() {
    ConsultaJogoImpl helloWorldImpl = new ConsultaJogoImpl();
    Jogo response = helloWorldImpl.consultaJogo("Galo", "Cruzeiro", "Belo Horizonte");
    System.out.println(response.getTime1());
    System.out.println(response.getTime2());
    System.out.println(response.getCidade());
    System.out.println(response.getMotivo());
    System.out.println(response.getResultado());
    System.out.println(response.getInformacoesAdicionais());
  }
}
