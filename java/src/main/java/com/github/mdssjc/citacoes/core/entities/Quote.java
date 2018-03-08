package com.github.mdssjc.citacoes.core.entities;

import lombok.Value;

/**
 * Representa a entidade Quote (Citação).
 * <p>
 * - define os elementos de uma citação: id, categoria, texto e autor.
 *
 * @author Marcelo dos Santos
 */
@Value
public class Quote {

  long id;
  String categoria;
  String texto;
  String autor;

  @Override
  public String toString() {
    return String.format("%d.%s: \"%s\" (%s)",
                         this.id, this.categoria,
                         this.texto, this.autor);
  }
}
