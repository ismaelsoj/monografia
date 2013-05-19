package br.com.ismael;

import javax.jws.WebService;
import br.com.ismael.Partida;

@WebService(endpointInterface = "br.com.ismael.ConsultaPartida")
public class ConsultaPartidaImpl implements ConsultaPartida {

  @Override
  public Partida consultaPartida(String nomeTime1, String nomeTime2, String cidade) {
    return new EfetuaConsultaPartida().consultaPartida(nomeTime1, nomeTime2, cidade);
  }

}
