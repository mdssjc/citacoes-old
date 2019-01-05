package com.github.mdssjc.citacoes.core.presenter;

/**
 * @author Marcelo dos Santos
 */
public class QuotePresenter implements Presenter {

  private String message;

  @Override
  public void result(final String message) {
    this.message = message;
  }

  @Override
  public String message() {
    return this.message;
  }
}
