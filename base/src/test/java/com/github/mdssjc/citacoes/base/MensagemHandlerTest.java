package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.model.Mensagem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Teste unitário para a classe MensagemHandler.
 *
 * @author Marcelo dos Santos
 *
 */
public class MensagemHandlerTest {
  @Test
  public void constroiUmaMensagemSemId() {
    final Mensagem padrao = new Mensagem();
    padrao.setId(0);
    padrao.setCategoria("Categoria");
    padrao.setTexto("Mensagem...");
    padrao.setAutor("Autor");
    final String mensagem = "Categoria: \"Mensagem...\" (Autor)";

    final MensagemHandler handler = new MensagemHandler();
    final Mensagem resultado = handler.make(mensagem);

    Assert.assertEquals(padrao, resultado);
  }

  @Test
  public void constroiUmaMensagemComId() {
    final Mensagem padrao = new Mensagem();
    padrao.setId(10);
    padrao.setCategoria("Categoria");
    padrao.setTexto("Mensagem...");
    padrao.setAutor("Autor");
    final String mensagem = "Categoria: \"Mensagem...\" (Autor)";

    final MensagemHandler handler = new MensagemHandler();
    final Mensagem resultado = handler.make(mensagem, 10);

    Assert.assertEquals(padrao, resultado);
  }
}
