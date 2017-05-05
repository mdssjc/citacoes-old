package com.github.mdssjc.citacoes.base.unit_testing;

import com.github.mdssjc.citacoes.base.QuoteHandler;
import com.github.mdssjc.citacoes.dao.QuoteDao;
import com.github.mdssjc.citacoes.entities.Quote;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Teste unitário para a classe QuoteHandler.
 *
 * @author Marcelo dos Santos
 *
 */
public class QuoteHandlerTest {

  @Test
  public void geraUmaMensagem() {
    final QuoteDao dao = mock(QuoteDao.class);
    final Quote expected = new Quote();

    when(dao.getRandom()).thenReturn(expected);

    final QuoteHandler handler = new QuoteHandler(dao);
    final Quote result = handler.next();

    assertEquals(expected, result);
  }
}
