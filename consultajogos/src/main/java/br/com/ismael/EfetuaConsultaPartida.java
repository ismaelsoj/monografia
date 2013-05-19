package br.com.ismael;

import br.com.ismael.Partida;

/**
 * Classe que consulta o resultado de um jogo.
 * 
 * @author Ismael
 * 
 */
public class EfetuaConsultaPartida {

  /**
   * Atrav�s do nome dos times envolvidos e da cidade onde foi realizado o confronto (opcional), retorna os dados
   * relevantes da partida, como resultado, motivo e informa��es adicionais.
   * 
   * @param nomeTime1
   * @param nomeTime2
   * @param cidade
   * @return Objeto {@link Partida} contendo as principais informa��es do confronto selecionado.
   */
  public Partida consultaPartida(String time1, String time2, String cidade) {
    return new Partida(time1, time2, "2x1", cidade, "Amistoso",
        "Foi um jogo muito truncado, com muitas faltas e expuls�es");
  }

}
