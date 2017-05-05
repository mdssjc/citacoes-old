package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.Dao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class QuoteHandler_Factory implements Factory<QuoteHandler> {
  private final Provider<Dao> daoProvider;

  public QuoteHandler_Factory(Provider<Dao> daoProvider) {
    assert daoProvider != null;
    this.daoProvider = daoProvider;
  }

  @Override
  public QuoteHandler get() {
    return new QuoteHandler(daoProvider.get());
  }

  public static Factory<QuoteHandler> create(Provider<Dao> daoProvider) {
    return new QuoteHandler_Factory(daoProvider);
  }
}
