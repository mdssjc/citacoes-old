package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.Dao;
import com.github.mdssjc.citacoes.entities.Quote;

import javax.inject.Inject;

/**
 * Classe coordenadora de citações.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuoteHandler {

  private final Dao dao;

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

  /**
   * Produz uma citação aleatóriamente.
   *
   * @return Citação
   */
  public Quote next() {
    return this.dao.getRandom();
  }
}
