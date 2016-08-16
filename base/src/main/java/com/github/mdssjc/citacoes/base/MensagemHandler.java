package com.github.mdssjc.citacoes.base;

import java.util.concurrent.ThreadLocalRandom;

import com.github.mdssjc.citacoes.dao.MensagemDao;
import com.github.mdssjc.citacoes.model.Mensagem;

/**
 * Classe coordenadora de mensagens.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemHandler {

  private final long        MAX;
  private final MensagemDao dao;

  public MensagemHandler(final MensagemDao dao) {
    this.dao = dao;
    this.MAX = dao.total();
  }

  public Mensagem nextMessage() {
    final long rnd = ThreadLocalRandom.current()
      .nextLong(1, this.MAX);

    return this.dao.find(rnd);
  }
}
