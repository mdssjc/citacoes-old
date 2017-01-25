package com.github.mdssjc.citacoes.base;

/**
 * Classe de entrada da aplicação.
 *
 * @author Marcelo dos Santos
 *
 */
public class Main {

  public static void main(final String[] args) {
    if (args.length == 0) {
      System.out.println(new MensagemHandler().nextMessage());
    }
  }
}
