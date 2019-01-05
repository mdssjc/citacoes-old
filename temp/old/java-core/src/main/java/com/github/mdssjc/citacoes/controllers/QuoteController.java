package com.github.mdssjc.citacoes.controllers;

import com.github.mdssjc.citacoes.gateways.QuoteDao;
import com.github.mdssjc.citacoes.usecase.Presenter;
import com.github.mdssjc.citacoes.usecase.QuoteHandler;
import com.github.mdssjc.citacoes.usecase.dao.Dao;

public class QuoteController implements Controller {

  private QuoteHandler handler;

  public QuoteController(final Presenter view) {
    Dao dao = new QuoteDao();
    handler = new QuoteHandler(dao, view);
  }

  @Override
  public void next() {
    handler.next();
  }
}

