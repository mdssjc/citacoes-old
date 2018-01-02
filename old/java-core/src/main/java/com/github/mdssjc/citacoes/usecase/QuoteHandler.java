package com.github.mdssjc.citacoes.usecase;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.usecase.dao.Dao;

import javax.inject.Inject;

/**
 * Classe coordenadora de citações.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuoteHandler {

  private final Dao<Quote> dao;
  private Presenter view;

  /**
   * Inicializa o handler.
   *
   * @param dao
   *     Dependência do repositório
   */
  @Inject
  public QuoteHandler(final Dao dao) {
    this.dao = dao;
  }

  public QuoteHandler(final Dao dao, final Presenter view) {
    this.dao = dao;
    this.view = view;
  }

  /**
   * Produz uma citação aleatóriamente.
   *
   * @return Citação
   */
  public void next() {
    view.setMessage(this.dao.getRandom());
  }
}
