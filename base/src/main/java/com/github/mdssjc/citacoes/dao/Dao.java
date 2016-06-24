package com.github.mdssjc.citacoes.dao;

/**
 * Interface de abstração de dados.
 * 
 * @author Marcelo dos Santos
 *
 * @param <T>
 *          Tipo de dado
 */
public interface Dao<T> {

  void save(T type) throws DaoException;

  void set(T type) throws DaoException;

  void delete(T type) throws DaoException;

  T findById(long id) throws DaoException;
}
