package com.github.mdssjc.citacoes.model;

import lombok.Data;

/**
 * Classe da entidade Mensagem.
 * <p/>
 * Representa os elementos da mensagem: id, autor, categoria e a texto
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
