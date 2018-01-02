package com.github.mdssjc.citacoes.usecase.dao;

/**
 * Exceção do DAO.
 * 
 * @author Marcelo dos Santos
 *
 */
public class DaoException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public DaoException() {
  }

  public DaoException(final String message) {
    super(message);
  }

  public DaoException(final Throwable cause) {
    super(cause);
  }

  public DaoException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
