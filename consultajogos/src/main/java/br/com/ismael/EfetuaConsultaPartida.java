package br.com.ismael;

import java.util.GregorianCalendar;
import br.com.ismael.Partida;

/**
 * Classe que consulta o resultado de um jogo.
 * 
 * @author Ismael
 * 
 */
public class EfetuaConsultaPartida {

  /**
   * Através do nome dos times envolvidos e da cidade onde foi realizado o confronto (opcional), retorna os dados
   * relevantes da partida, como resultado, motivo e informações adicionais.
   * @param data 
   * 
   * @param nomeTime1
   * @param nomeTime2
   * @param cidade
   * @return Objeto {@link Partida} contendo as principais informações do confronto selecionado.
   */
  public Partida consultaPartida(String time1, String time2, GregorianCalendar data, String cidade) {
    return new Partida(time1, time2, "2x1", data, cidade, "Amistoso",
        "Foi um jogo muito truncado, com muitas faltas e expulsões");
  }

}
