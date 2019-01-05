package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.controllers.Controller;
import com.github.mdssjc.citacoes.controllers.QuoteController;
import com.github.mdssjc.citacoes.presenters.QuotePresenter;
import com.github.mdssjc.citacoes.usecase.Presenter;

/**
 * Classe de entrada da aplicação.
 *
 * @author Marcelo dos Santos
 */
public class Main {

  public static void main(final String[] args) {
    final String op = args.length == 0 ? "" : args[0];
    final Operation operation = Operation.fromString(op);

    Presenter view = new QuotePresenter();
    Controller controller = new QuoteController(view);

    switch (operation) {
      case SINGLE:
        controller.next();
        System.out.println(view.message());
        break;
      case LOOP:
        // TODO ...
        break;
    }
  }
}
