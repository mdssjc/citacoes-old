package com.github.mdssjc.base.dao;

public interface DAO<T> {

  void save(T type) throws DAOException;

  void set(T type) throws DAOException;

  void delete(T type) throws DAOException;

  T findById(long id) throws DAOException;
}
