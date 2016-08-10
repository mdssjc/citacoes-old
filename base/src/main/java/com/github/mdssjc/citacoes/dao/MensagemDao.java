package com.github.mdssjc.citacoes.dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.github.mdssjc.citacoes.entities.Mensagem;

/**
 * Implementação DAO da entidade Mensagem.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemDao implements Dao<Mensagem> {

  private final Map<Long, Mensagem> repositorio;

  public MensagemDao() {
    this.repositorio = new HashMap<>();
    try {
      new MensagemSpliterator(
          Files.readAllLines(Paths.get("repositorio"))
            .toArray(new String[0]),
          0, 4).forEachRemaining(m -> this.repositorio.put(m.getId(), m));
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void save(final Mensagem type) throws DaoException {
  }

  @Override
  public void remove(final Mensagem type) throws DaoException {
  }

  @Override
  public Mensagem find(final long id) {
    return this.repositorio.get(id);
  }

  @Override
  public Mensagem[] findAll() {
    return this.repositorio.values()
      .toArray(new Mensagem[0]);
  }

  public int total() {
    return this.repositorio.size();
  }
}
