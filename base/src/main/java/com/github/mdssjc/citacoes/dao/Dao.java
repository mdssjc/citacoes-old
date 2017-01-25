package com.github.mdssjc.citacoes.dao;

import java.util.List;

/**
 * Interface de abstração de dados (DAO).
 * 
 * @author Marcelo dos Santos
 *
 * @param <T>
 *          Tipo de dado
 */
public interface Dao<T> {

  /**
   * Persiste o tipo no repositório.
   * 
   * @param type
   *          Tipo do dado
   * @throws DaoException
   */
  void save(T type) throws DaoException;

  /**
   * Remove o tipo do repositório.
   * 
   * @param type
   *          Tipo do dado
   * @throws DaoException
   */
  void remove(T type) throws DaoException;

  /**
   * Seleciona o tipo através da identificação no repositório.
   * 
   * @param id
   *          Identificação do tipo
   * @return Tipo recuperado
   * @throws DaoException
   */
  T find(long id) throws DaoException;

  /**
   * Seleciona uma coleção dos tipos no repositório.
   * 
   * @return Coleção dos tipos de dados
   * @throws DaoException
   */
  List<T> findAll() throws DaoException;
}
