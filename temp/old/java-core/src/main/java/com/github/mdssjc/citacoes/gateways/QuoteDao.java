package com.github.mdssjc.citacoes.gateways;

import com.github.mdssjc.citacoes.usecase.dao.Dao;
import com.github.mdssjc.citacoes.usecase.dao.DaoException;
import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.entities.Quotes;
import com.github.mdssjc.citacoes.utils.Config;

import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Implementação DAO da entidade Quote.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuoteDao implements Dao<Quote> {

  private final Map<Long, Quote> repository;

  public QuoteDao() {
    final String path = Config.INSTANCE.getProperty("repository.path");
    this.repository = new HashMap<>();

    try (final Scanner scanner = new Scanner(new FileInputStream(path))) {
      for (long i = 0; scanner.hasNext(); i++) {
        final String message = scanner.nextLine();
        this.repository.put(i, Quotes.of(message, i));
      }
    } catch (final Exception e) {
      throw new DaoException("Falha ao inicializar o repositório.", e);
    }
  }

  @Override
  public void save(final Quote type) {
  }

  @Override
  public void remove(final Quote type) {
  }

  @Override
  public Quote find(final long id) {
    return this.repository.get(id);
  }

  @Override
  public List<Quote> findAll() {
    return new ArrayList<>(this.repository.values());
  }

  @Override
  public Quote getRandom() {
    return this.repository.get(ThreadLocalRandom.current()
                                                .nextLong(0, this.repository.size()));
  }
}
