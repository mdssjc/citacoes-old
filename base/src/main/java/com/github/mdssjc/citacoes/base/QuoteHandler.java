package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.DaoException;
import com.github.mdssjc.citacoes.dao.QuoteDao;
import com.github.mdssjc.citacoes.entities.Quote;
import lombok.extern.java.Log;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

/**
 * Classe coordenadora de citações.
 *
 * @author Marcelo dos Santos
 */
@Log
public class QuoteHandler {

  private QuoteDao dao;

  public QuoteHandler() {
    try {
      this.dao = new QuoteDao();
    } catch (final DaoException e) {
      log.log(Level.SEVERE, e.getMessage());
    }
  }

  public Quote next() {
    final long random = ThreadLocalRandom.current()
                                         .nextLong(0, this.dao.total());
    return this.dao.find(random);
  }
}
