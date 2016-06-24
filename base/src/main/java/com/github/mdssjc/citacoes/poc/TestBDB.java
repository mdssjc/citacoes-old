package com.github.mdssjc.citacoes.poc;

import java.io.File;

import com.sleepycat.je.Database;
import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseEntry;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.Environment;
import com.sleepycat.je.EnvironmentConfig;
import com.sleepycat.je.LockMode;
import com.sleepycat.je.OperationStatus;

public class TestBDB {

  public static void main(String[] args) {
    Environment myDbEnvironment = null;
    Database myDatabase = null;

    try {
      EnvironmentConfig envConfig = new EnvironmentConfig();
      envConfig.setAllowCreate(true);
      myDbEnvironment = new Environment(new File("/home/mdssjc/db"), envConfig);

      DatabaseConfig dbConfig = new DatabaseConfig();
      dbConfig.setAllowCreate(true);
      myDatabase = myDbEnvironment.openDatabase(null, "TestDatabase", dbConfig);

      write(myDatabase);
      read(myDatabase);
    } catch (DatabaseException e) {
      System.err.println(e);
    } finally {
      if (myDatabase != null) {
        myDatabase.close();
      }

      if (myDbEnvironment != null) {
        myDbEnvironment.close();
      }
    }
  }

  private static void read(Database myDatabase) {
    String key = "myKey";

    try {
      DatabaseEntry theKey = new DatabaseEntry(key.getBytes("UTF-8"));
      DatabaseEntry theData = new DatabaseEntry();

      if (myDatabase.get(null, theKey, theData,
          LockMode.DEFAULT) == OperationStatus.SUCCESS) {

        byte[] retData = theData.getData();
        String foundData = new String(retData, "UTF-8");
        System.out.println("key: '" + key + "' data: '" + foundData + "'.");
      } else {
        System.out.println("No record found with key '" + key + "'.");
      }
    } catch (Exception e) {
      System.err.println(e);
    }
  }

  private static void write(Database myDatabase) {
    String key = "myKey";
    String data = "myData";

    try {
      DatabaseEntry theKey = new DatabaseEntry(key.getBytes("UTF-8"));
      DatabaseEntry theData = new DatabaseEntry(data.getBytes("UTF-8"));
      myDatabase.put(null, theKey, theData);
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
