package com.github.mdssjc.citacoes.utils;

import com.github.mdssjc.citacoes.dao.Dao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideDaoFactory implements Factory<Dao> {
  private static final AppModule_ProvideDaoFactory INSTANCE = new AppModule_ProvideDaoFactory();

  @Override
  public Dao get() {
    return Preconditions.checkNotNull(
        AppModule.provideDao(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Dao> create() {
    return INSTANCE;
  }
}
