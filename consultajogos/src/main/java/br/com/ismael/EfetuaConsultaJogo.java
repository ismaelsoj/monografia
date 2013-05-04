package br.com.ismael;

import br.com.ismael.jogo.Jogo;
import br.com.ismael.time.Time;

/**
 * Classe que consulta o resultado de um jogo.
 * 
 * @author Ismael
 * 
 */
public class EfetuaConsultaJogo {

  /**
   * Através do nome dos times envolvidos e da cidade onde foi realizado o confronto (opcional), retorna os dados
   * relevantes da partida, como resultado, motivo e informações adicionais.
   * 
   * @param nomeTime1
   * @param nomeTime2
   * @param cidade
   * @return Objeto {@link Jogo} contendo as principais informações do confronto selecionado.
   */
  public Jogo consultaJogo(String nomeTime1, String nomeTime2, String cidade) {
    Time time1 = new Time(nomeTime1);
    Time time2 = new Time(nomeTime2);
    return new Jogo(time1, time2, "2x1", cidade, "Amistoso",
        "Foi um jogo muito truncado, com muitas faltas e expulsões");
  }

}
