package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.DaoException;
import com.github.mdssjc.citacoes.dao.MensagemDao;
import com.github.mdssjc.citacoes.model.Mensagem;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe coordenadora de mensagens.
 *
 * @author Marcelo dos Santos
 *
 */
public class MensagemHandler {

  private static final String REGEX = "(.*): \"(.*)\" \\((.*)\\)";
  private MensagemDao dao;

  public MensagemHandler() {
    try {
      this.dao = new MensagemDao();
    } catch (final DaoException e) {
      e.printStackTrace();
    }
  }

  public Mensagem nextMessage() {
    final long rnd = ThreadLocalRandom.current()
                                      .nextLong(1, this.dao.total());
    return this.dao.find(rnd);
  }

  public Mensagem make(final String message) {
    return make(message, 0, false);
  }

  public Mensagem make(final String message, final int id) {
    return make(message, id, true);
  }

  private Mensagem make(final String message, final int id, final boolean idUsed) {
    final Pattern pattern = Pattern.compile(REGEX);
    final Matcher matcher = pattern.matcher(message);
    matcher.find();

    final Mensagem mensagem = new Mensagem();
    mensagem.setId(idUsed ? id : 0);
    mensagem.setCategoria(matcher.group(1));
    mensagem.setTexto(matcher.group(2));
    mensagem.setAutor(matcher.group(3));

    return mensagem;
  }
}
