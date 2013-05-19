package br.com.ismael;

/**
 * Classe que representa um jogo de futebol.
 * 
 * @author Ismael
 * 
 */
public class Partida {

  private String time1;
  private String time2;
  private String resultado;
  private String cidade;
  private String motivo;
  private String informacoesAdicionais;

  public Partida(String time1, String time2, String resultado, String cidade, String motivo, String informacoesAdicionais) {
    this.time1 = time1;
    this.time2 = time2;
    this.resultado = resultado;
    this.cidade = cidade;
    this.motivo = motivo;
    this.informacoesAdicionais = informacoesAdicionais;
  }

  public Partida() {
  }

  /*
   * Métodos acessores
   */
  public String getTime1() {
    return time1;
  }

  public void setTime1(String time1) {
    this.time1 = time1;
  }

  public String getTime2() {
    return time2;
  }

  public void setTime2(String time2) {
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

  @Override
  public String toString() {
    return this.getTime1() + " x " + this.getTime2() + ": " + this.getResultado() + " - " + this.getCidade() + " - "
        + this.getMotivo() + " - " + this.getInformacoesAdicionais();
  }

}
