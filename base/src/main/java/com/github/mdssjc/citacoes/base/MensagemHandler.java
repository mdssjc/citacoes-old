package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.DaoException;
import com.github.mdssjc.citacoes.dao.MensagemDao;
import com.github.mdssjc.citacoes.entities.Quote;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe coordenadora de mensagens.
 *
 * @author Marcelo dos Santos
 *
 */
public class MensagemHandler {

  private MensagemDao dao;

  public MensagemHandler() {
    try {
      this.dao = new MensagemDao();
    } catch (final DaoException e) {
      e.printStackTrace();
    }
  }

  public Quote nextMessage() {
    final long rnd = ThreadLocalRandom.current()
                                      .nextLong(0, this.dao.total());
    return this.dao.find(rnd);
  }
}
