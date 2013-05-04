package br.com.ismael.jogo;

import br.com.ismael.time.Time;

/**
 * Classe que representa um jogo de futebol.
 * 
 * @author Ismael
 * 
 */
public class Jogo {

  private Time time1;
  private Time time2;
  private String resultado;
  private String cidade;
  private String motivo;
  private String informacoesAdicionais;

  public Jogo(Time time1, Time time2, String resultado, String cidade, String motivo, String informacoesAdicionais) {
    this.time1 = time1;
    this.time2 = time2;
    this.resultado = resultado;
    this.cidade = cidade;
    this.motivo = motivo;
    this.informacoesAdicionais = informacoesAdicionais;
  }

  /*
   * Métodos acessores
   */
  public Time getTime1() {
    return time1;
  }

  public void setTime1(Time time1) {
    this.time1 = time1;
  }

  public Time getTime2() {
    return time2;
  }

  public void setTime2(Time time2) {
    this.time2 = time2;
  }

  public String getResultado() {
    return resultado;
  }

  public void setResultado(String resultado) {
    this.resultado = resultado;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getMotivo() {
    return motivo;
  }

  public void setMotivo(String motivo) {
    this.motivo = motivo;
  }

  public String getInformacoesAdicionais() {
    return informacoesAdicionais;
  }

  public void setInformacoesAdicionais(String informacoesAdicionais) {
    this.informacoesAdicionais = informacoesAdicionais;
  }

}
