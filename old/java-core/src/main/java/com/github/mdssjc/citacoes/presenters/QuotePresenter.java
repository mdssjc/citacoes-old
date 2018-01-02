package com.github.mdssjc.citacoes.presenters;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.usecase.Presenter;

public class QuotePresenter implements Presenter {

  private Quote quote;

  @Override
  public String message() {
    return this.quote.getTexto();
  }

  @Override
  public void setMessage(final Quote quote) {
    this.quote = quote;
  }
}
