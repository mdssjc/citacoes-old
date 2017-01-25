package com.github.mdssjc.citacoes.dao;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.utils.Config;

import java.io.FileInputStream;
import java.util.*;

/**
 * Implementação DAO da entidade Mensagem.
 *
 * @author Marcelo dos Santos
 *
 */
public class MensagemDao implements Dao<Quote> {

  private final Map<Long, Quote> repositorio;

  public MensagemDao() throws DaoException {
    String rep = Config.INSTANCE.getProperty("repository.path");
    this.repositorio = new HashMap<>();

    try (final Scanner scanner = new Scanner(new FileInputStream(rep))) {
      for (long i = 0; scanner.hasNext(); i++) {
        String message = scanner.nextLine();
        this.repositorio.put(i, Quote.of(message, i));
      }
    } catch (final Exception e) {
      throw new DaoException("Falha ao inicializar o repositório.", e);
    }
  }

  @Override
  public void save(final Quote type) throws DaoException {
  }

  @Override
  public void remove(final Quote type) throws DaoException {
  }

  @Override
  public Quote find(final long id) {
    return this.repositorio.get(id);
  }

  @Override
  public List<Quote> findAll() {
    return new ArrayList<>(this.repositorio.values());
  }

  public int total() {
    return this.repositorio.size();
  }
}
