package com.github.mdssjc.citacoes.core.controller;

import com.github.mdssjc.citacoes.core.use_cases.Command;

/**
 * @author Marcelo dos Santos
 */
public interface Controller {

  void operation(Command command);
}
