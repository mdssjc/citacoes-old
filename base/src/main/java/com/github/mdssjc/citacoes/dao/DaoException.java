package com.github.mdssjc.citacoes.dao;

/**
 * Exceção do Dao.
 * 
 * @author Marcelo dos Santos
 *
 */
@SuppressWarnings("serial")
public class DaoException extends Exception {

  public DaoException() {
  }

  public DaoException(String message) {
    super(message);
  }

  public DaoException(Throwable cause) {
    super(cause);
  }

  public DaoException(String message, Throwable cause) {
    super(message, cause);
  }
}
