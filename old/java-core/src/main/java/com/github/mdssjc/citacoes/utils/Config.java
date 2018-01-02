package com.github.mdssjc.citacoes.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Singleton utilitário para as configurações.
 *
 * @author Marcelo dos Santos
 *
 */
public enum Config {
  INSTANCE;

  private final Properties properties;

  Config() {
    this.properties = new Properties();
    final InputStream is = getClass().getClassLoader()
                                     .getResourceAsStream("config.properties");

    try {
      this.properties.load(is);
    } catch (final IOException e) {
      System.err.println(e.getMessage());
    }
  }

  public String getProperty(final String key) {
    return INSTANCE.properties.getProperty(key);
  }

  public void testMode() {
    INSTANCE.properties.setProperty("repository.path", "repositorio");
  }
}
