package com.github.mdssjc.citacoes.core.use_cases;

/**
 * @author Marcelo dos Santos
 */
public class QuoteUseCase implements InputPort {

  private final OutputPort output;

  public QuoteUseCase(final OutputPort output) {
    this.output = output;
  }

  @Override
  public void handle(final Command command) {
    command.execute();
    this.output.result("");
  }
}
