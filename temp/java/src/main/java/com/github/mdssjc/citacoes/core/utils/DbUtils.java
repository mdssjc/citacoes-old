package com.github.mdssjc.citacoes.core.utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

  /**
   * Cria um novo banco de dados.
   *
   * @param fileName
   *     o nome do banco de dados
   */
  public static void create(String fileName) {
    String url = "jdbc:sqlite:" + fileName;

    try (Connection conn = DriverManager.getConnection(url)) {
      if (conn != null) {
        DatabaseMetaData meta = conn.getMetaData();
        System.out.println("The driver name is " + meta.getDriverName());
        System.out.println("A new database has been created.");
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * Conecta ao banco de dados
   */
  public static void connect() {
    String url = "jdbc:sqlite:quotes.db";

    try (Connection conn = DriverManager.getConnection(url)) {
      System.out.println("Connection to SQLite has been established.");
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
