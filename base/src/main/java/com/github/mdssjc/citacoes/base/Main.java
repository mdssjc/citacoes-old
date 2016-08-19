package com.github.mdssjc.citacoes.base;

import com.github.mdssjc.citacoes.dao.MensagemDao;
import com.github.mdssjc.citacoes.model.Mensagem;

/**
 * Classe de entrada da aplicação.
 * 
 * @author Marcelo dos Santos
 *
 */
public class Main {

  public static void main(final String[] args) {
    if (args.length == 0) {
      final MensagemHandler handler = new MensagemHandler(new MensagemDao());
      final Mensagem mensagem = handler.nextMessage();

      System.out.println(mensagem.getId());
      System.out.println(mensagem.getCategoria());
      System.out.println(mensagem.getAutor());
      System.out.println(mensagem.getTexto());
    }
  }
}
