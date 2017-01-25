package com.github.mdssjc.citacoes.base.unit_testing;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.utils.Config;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Teste unitário para a classe Quote.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuoteTest {

  @Before
  public void setup() {
    Config.INSTANCE.testMode();
  }

  @Test
  public void constroiUmaMensagemSemId() {
    final Quote reference = new Quote();
    reference.setCategoria("Categoria");
    reference.setTexto("Mensagem...");
    reference.setAutor("Autor");
    final String message = "Categoria: \"Mensagem...\" (Autor)";

    final Quote result = Quote.of(message);

    Assert.assertEquals(reference, result);
  }

  @Test
  public void constroiUmaMensagemComId() {
    final Quote quote = new Quote();
    quote.setId(10);
    quote.setCategoria("Categoria");
    quote.setTexto("Mensagem...");
    quote.setAutor("Autor");
    final String message = "Categoria: \"Mensagem...\" (Autor)";

    final Quote result = Quote.of(message, 10);

    Assert.assertEquals(quote, result);
  }
}
