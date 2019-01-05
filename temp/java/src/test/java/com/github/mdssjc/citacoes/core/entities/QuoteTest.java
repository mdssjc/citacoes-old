package com.github.mdssjc.citacoes.core.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste da Entidade Quote")
public class QuoteTest {

  @Test
  @DisplayName("Testa o formato da impressão")
  void testandoAImpressaoDoQuote() {
    Quote quote = new Quote(1, "Categoria", "Texto", "Autor");

    Assertions.assertEquals("1.Categoria: \"Texto\" (Autor)", quote.toString());
  }
}
