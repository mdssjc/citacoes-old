package com.github.mdssjc.citacoes.entities;

import lombok.Data;

/**
 * Entidade Mensagem.
 * <p/>
 * Representa os elementos da mensagem, como: id, autor, categoria e a texto
 * 
 * @author Marcelo dos Santos
 *
 */
@Data
public class Mensagem {

  private long   id;
  private String autor;
  private String categoria;
  private String texto;
}
