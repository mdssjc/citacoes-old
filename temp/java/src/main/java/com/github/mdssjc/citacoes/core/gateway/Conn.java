package com.github.mdssjc.citacoes.core.gateway;

import com.github.mdssjc.citacoes.core.entities.Quote;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

  /*
   SELECT column FROM table
   ORDER BY RANDOM() LIMIT 1
  */

  private void connect() {
    String url = "jdbc:sqlite:quotes.db";

    try (Connection conn = DriverManager.getConnection(url)) {
      System.out.println("Connection to SQLite has been established.");

      QueryRunner runner = new QueryRunner();
      BeanHandler<Quote> handler = new BeanHandler<>(Quote.class);
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  public void command() {
  }

  public void query() {
  }
}
