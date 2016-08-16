package com.github.mdssjc.citacoes.dao;

import java.util.Spliterator;
import java.util.function.Consumer;

import com.github.mdssjc.citacoes.model.Mensagem;

/**
 * Mensagem Spliterator.
 * 
 * @author Marcelo dos Santos
 *
 */
public class MensagemSpliterator implements Spliterator<Mensagem> {

  private final String[] linhas;
  private int            inicio;
  private int            fim;

  public MensagemSpliterator(final String[] linhas, final int inicio,
      final int fim) {
    this.linhas = linhas;
    this.inicio = inicio;
    this.fim = fim;
  }

  @Override
  public int characteristics() {
    return Spliterator.NONNULL | Spliterator.DISTINCT | Spliterator.IMMUTABLE;
  }

  @Override
  public long estimateSize() {
    return this.linhas.length - this.inicio;
  }

  @Override
  public boolean tryAdvance(final Consumer<? super Mensagem> action) {
    final Mensagem mensagem = new Mensagem();
    mensagem.setId(Long.parseLong(this.linhas[this.inicio]));
    mensagem.setCategoria(this.linhas[this.inicio + 1]);
    mensagem.setAutor(this.linhas[this.inicio + 2]);
    mensagem.setTexto(this.linhas[this.inicio + 3]);

    action.accept(mensagem);
    this.inicio = this.fim;
    this.fim += 4;

    return this.fim <= this.linhas.length;
  }

  @Override
  public Spliterator<Mensagem> trySplit() {
    MensagemSpliterator spliterator = null;
    if (this.fim <= this.linhas.length) {
      spliterator = new MensagemSpliterator(this.linhas, this.inicio, this.fim);
    }
    return spliterator;
  }
}
