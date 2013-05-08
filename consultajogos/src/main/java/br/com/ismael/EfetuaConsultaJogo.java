package br.com.ismael;

import br.com.ismael.Jogo;

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
  public Jogo consultaJogo(String time1, String time2, String cidade) {
    return new Jogo(time1, time2, "2x1", cidade, "Amistoso",
        "Foi um jogo muito truncado, com muitas faltas e expulsões");
  }

}
