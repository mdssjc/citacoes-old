package com.github.mdssjc.citacoes.usecase;

import com.github.mdssjc.citacoes.entities.Quote;

public interface Presenter {

  void setMessage(Quote quote);

  String message();
}
