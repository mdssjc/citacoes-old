package com.github.mdssjc.citacoes.base.unit_testing;

import com.github.mdssjc.citacoes.base.Operation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste unitário para a classe Operation.
 *
 * @author Marcelo dos Santos
 *
 */
public class OperationTest {

  @Test
  public void recuperaAOperacaoSingle() {
    final String argument = "";

    final Operation result = Operation.fromString(argument);

    assertEquals(Operation.SINGLE, result);
  }

  @Test
  public void recuperaAOperacaoLoop() {
    final String argument = "loop";

    final Operation result = Operation.fromString(argument);

    assertEquals(Operation.LOOP, result);
  }
}
