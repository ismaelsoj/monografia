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
   * Para instanciar um objeto Time, é necessário apenas seu nome.
   * 
   * @param nome
   */
  public Time(String nome) {
    this.nome = nome;
  }

  /*
   * Métodos acessores.
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
