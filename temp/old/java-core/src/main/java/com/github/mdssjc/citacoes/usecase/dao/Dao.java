package com.github.mdssjc.citacoes.usecase.dao;

import java.util.List;

/**
 * Interface de abstração de dados (DAO).
 *
 * @author Marcelo dos Santos
 *
 * @param <T>
 *     Tipo de dado
 */
public interface Dao<T> {

  /**
   * Persiste o tipo no repositório.
   *
   * @param type
   *     Tipo do dado
   */
  void save(T type);

  /**
   * Remove o tipo do repositório.
   *
   * @param type
   *     Tipo do dado
   */
  void remove(T type);

  /**
   * Seleciona o tipo através da identificação no repositório.
   *
   * @param id
   *     Identificação do tipo
   *
   * @return Tipo recuperado
   */
  T find(long id);

  /**
   * Seleciona uma coleção dos tipos no repositório.
   *
   * @return Coleção dos tipos de dados
   */
  List<T> findAll();

  /**
   * Seleciona o tipo aleatóriamente no repositório.
   *
   * @return Tipo recuperado
   */
  T getRandom();
}
