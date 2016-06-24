package com.github.mdssjc.citacoes.poc;

import java.io.File;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;

public class BDBUtil {

  private static final String PATH_DB = "/home/mdssjc/db";
  private static final String NAME_DB = "CitacoesDB";

  private static Environment  myDbEnvironment;
  private static Database     myDatabase;

  static {
    EnvironmentConfig envConfig = new EnvironmentConfig();
    DatabaseConfig dbConfig = new DatabaseConfig();

    envConfig.setAllowCreate(true);
    dbConfig.setAllowCreate(true);

    myDbEnvironment = new Environment(new File(PATH_DB), envConfig);
    myDatabase = myDbEnvironment.openDatabase(null, NAME_DB, dbConfig);
  }

  public static Database get() {
    return myDatabase;
  }

  public static void close() {
    if (myDatabase != null) {
      myDatabase.close();
    }

    if (myDbEnvironment != null) {
      myDbEnvironment.close();
    }
  }
}
