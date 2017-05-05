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
    final String op = args.length == 0 ? "" : args[0];
    final Operation operation = Operation.fromString(op);

    switch (operation) {
      case SINGLE:
        final AppComponent component = DaggerAppComponent.create();
        final QuoteHandler handler = component.maker();
        System.out.println(handler.next());
        break;
      case LOOP:
        break;
    }
  }
}
