package com.github.mdssjc.citacoes.base.unit_testing;

import com.github.mdssjc.citacoes.entities.Quote;
import com.github.mdssjc.citacoes.entities.Quotes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Teste unitário para a classe Quotes.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuotesTest {

  private Quote quote;

  @Before
  public void setup() {
    quote = new Quote();
  }

  @Test
  public void constroiUmaMensagemSemId() {
    quote.setCategoria("Categoria");
    quote.setTexto("Mensagem...");
    quote.setAutor("Autor");
    final String message = "Categoria: \"Mensagem...\" (Autor)";

    final Quote result = Quotes.of(message);

    Assert.assertEquals(quote, result);
  }

  @Test
  public void constroiUmaMensagemComId() {
    long id = 10L;

    quote.setId(id);
    quote.setCategoria("Categoria");
    quote.setTexto("Mensagem...");
    quote.setAutor("Autor");
    final String message = "Categoria: \"Mensagem...\" (Autor)";

    final Quote result = Quotes.of(message, id);

    Assert.assertEquals(quote, result);
  }
}
