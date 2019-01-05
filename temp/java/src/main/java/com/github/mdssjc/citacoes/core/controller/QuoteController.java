package com.github.mdssjc.citacoes.core.controller;

import com.github.mdssjc.citacoes.core.use_cases.Command;
import com.github.mdssjc.citacoes.core.use_cases.InputPort;
import com.github.mdssjc.citacoes.core.use_cases.OutputPort;
import com.github.mdssjc.citacoes.core.use_cases.QuoteUseCase;

/**
 * @author Marcelo dos Santos
 */
public class QuoteController implements Controller {

  private final InputPort input;

  public QuoteController(final OutputPort output) {
    this.input = new QuoteUseCase(output);
  }

  @Override
  public void operation(final Command command) {
    this.input.handle(command);
  }
}
