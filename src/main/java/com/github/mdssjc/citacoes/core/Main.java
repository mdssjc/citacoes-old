package com.github.mdssjc.citacoes.core;

import com.github.mdssjc.citacoes.core.controller.Controller;
import com.github.mdssjc.citacoes.core.controller.QuoteController;
import com.github.mdssjc.citacoes.core.presenter.Presenter;
import com.github.mdssjc.citacoes.core.presenter.QuotePresenter;
import com.github.mdssjc.citacoes.core.use_cases.Command;
import com.github.mdssjc.citacoes.core.use_cases.NextCommand;

/**
 * Exemplo de aplicação.
 *
 * @author Marcelo dos Santos
 */
public class Main {

  public static void main(final String[] args) {
    final Presenter presenter = new QuotePresenter();
    final Controller controller = new QuoteController(presenter);

    final Command next = new NextCommand();
    controller.operation(next);

    System.out.println(presenter.message());
  }
}
