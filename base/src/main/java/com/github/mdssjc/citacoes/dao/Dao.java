package com.github.mdssjc.citacoes.dao;

/**
 * Interface de abstração de dados (DAO).
 * 
 * @author Marcelo dos Santos
 *
 * @param <T>
 *          Tipo de dado
 */
public interface Dao<T> {

  void save(T type) throws DaoException;

  void remove(T type) throws DaoException;

  T find(long id) throws DaoException;

  T[] findAll() throws DaoException;
}
