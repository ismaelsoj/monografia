package br.com.ismael;

import javax.jws.WebService;
import br.com.ismael.Jogo;

@WebService(endpointInterface = "br.com.ismael.ConsultaJogo")
public class ConsultaJogoImpl implements ConsultaJogo {

  @Override
  public Jogo consultaJogo(String nomeTime1, String nomeTime2, String cidade) {
    return new EfetuaConsultaJogo().consultaJogo(nomeTime1, nomeTime2, cidade);
  }

}
