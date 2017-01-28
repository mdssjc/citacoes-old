package com.github.mdssjc.citacoes.utils;

import com.github.mdssjc.citacoes.dao.Dao;
import com.github.mdssjc.citacoes.dao.QuoteDao;
import dagger.Module;
import dagger.Provides;

/**
 * Módulo com as receitas para a Injeção de Dependências.
 *
 * @author Marcelo dos Santos
 *
 */
@Module
public class AppModule {

  @Provides
  public static Dao provideDao() {
    return new QuoteDao();
  }
}
