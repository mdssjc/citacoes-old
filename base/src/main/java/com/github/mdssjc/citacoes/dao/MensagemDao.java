package com.github.mdssjc.citacoes.dao;

import com.github.mdssjc.citacoes.entities.Mensagem;

/**
 * Implementação DAO da entidade Mensagem.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemDao implements Dao<Mensagem> {

  @Override
  public void save(final Mensagem type) throws DaoException {
  }

  @Override
  public void remove(final Mensagem type) throws DaoException {
  }

  @Override
  public Mensagem find(final long id) throws DaoException {
    return null;
  }

  @Override
  public Mensagem[] findAll() throws DaoException {
    return null;
  }
}
