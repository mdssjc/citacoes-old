package com.github.mdssjc.base.dao;

@SuppressWarnings("serial")
public class DAOException extends Exception {

  public DAOException() {
  }

  public DAOException(String message) {
    super(message);
  }

  public DAOException(Throwable cause) {
    super(cause);
  }

  public DAOException(String message, Throwable cause) {
    super(message, cause);
  }
}
