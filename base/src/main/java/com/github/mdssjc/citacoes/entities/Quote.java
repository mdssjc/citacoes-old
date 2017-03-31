package com.github.mdssjc.citacoes.entities;

import lombok.Data;

/**
 * Classe da entidade Quote.
 * <p/>
 * Representa os elementos da citação: id, categoria, texto e autor
 *
 * @author Marcelo dos Santos
 *
 */
@Data
public class Quote {

  private long id;
  private String categoria;
  private String texto;
  private String autor;

  @Override
  public String toString() {
    return String.format("%d.%s: \"%s\" (%s)",
                         getId(), getCategoria(),
                         getTexto(), getAutor());
  }
}
