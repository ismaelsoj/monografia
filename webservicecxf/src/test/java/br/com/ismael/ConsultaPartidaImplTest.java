package br.com.ismael;

import org.junit.Test;
import br.com.ismael.Partida;

public class ConsultaPartidaImplTest {

  @Test
  public void testSayHi() {
    ConsultaPartidaImpl helloWorldImpl = new ConsultaPartidaImpl();
    Partida response = helloWorldImpl.consultaPartida("Galo", "Cruzeiro", "Belo Horizonte");
    System.out.println(response.getTime1());
    System.out.println(response.getTime2());
    System.out.println(response.getCidade());
    System.out.println(response.getMotivo());
    System.out.println(response.getResultado());
    System.out.println(response.getInformacoesAdicionais());
  }
}
