package com.github.mdssjc.citacoes.entities;

import lombok.Data;

/**
 * Entidade Quote (Citação).
 * <p/>
 * Representa os elementos de uma citação: id, categoria, texto e autor
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
