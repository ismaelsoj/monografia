package br.com.ismael.time;

/**
 * Classe que representa um time de futebol.
 * 
 * @author Ismael
 * 
 */
public class Time {

  String nome;

  /**
   * Para instanciar um objeto Time, � necess�rio apenas seu nome.
   * 
   * @param nome
   */
  public Time(String nome) {
    this.nome = nome;
  }

  /*
   * M�todos acessores.
   */
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return this.getNome();
  }

}
