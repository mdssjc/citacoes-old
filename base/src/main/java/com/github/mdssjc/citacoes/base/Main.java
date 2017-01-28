package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.utils.AppComponent;
import com.github.mdssjc.citacoes.utils.DaggerAppComponent;

/**
 * Classe de entrada da aplicação.
 *
 * @author Marcelo dos Santos
 *
 */
public class Main {

  public static void main(final String[] args) {
    if (args.length == 0) {
      final AppComponent component = DaggerAppComponent.create();
      final QuoteHandler handler = component.maker();
      System.out.println(handler.next());
    }
  }
}
