package br.com.ismael;

import java.util.GregorianCalendar;
import org.junit.Test;

public class ConsultaPartidaTest {

  @Test
  public void testConsultaPartida() {
    Partida partida = new ConsultaPartida().consultaPartida("Atlético-MG", "Cruzeiro", new GregorianCalendar(2013, 05,
        31), null);
    System.out.println(partida.getTime1());
    System.out.println(partida.getTime2());
    System.out.println(partida.getResultado());
    System.out.println(partida.getData().getTime().toString());
    System.out.println(partida.getCidade());
    System.out.println(partida.getMotivo());
    System.out.println(partida.getInformacoesAdicionais());
  }

}
