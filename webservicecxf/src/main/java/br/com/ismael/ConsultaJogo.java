package br.com.ismael;

import javax.jws.WebService;
import br.com.ismael.jogo.Jogo;

@WebService
public interface ConsultaJogo {

  Jogo consultaJogo(String nomeTime1, String nomeTime2, String cidade);
}
