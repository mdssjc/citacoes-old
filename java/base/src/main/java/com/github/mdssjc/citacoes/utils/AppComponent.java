package com.github.mdssjc.citacoes.utils;

import com.github.mdssjc.citacoes.base.QuoteHandler;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Interface para os componentes da Injeção de Dependências.
 *
 * @author Marcelo dos Santos
 *
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

  QuoteHandler maker();
}
