package com.github.mdssjc.citacoes.entities;

import lombok.Data;

/**
 * Entidade Citação.
 * <p/>
 * Representa os elementos da citação, como: id, autor, categoria e a mensagem
 * 
 * @author Marcelo dos Santos
 *
 */
@Data
public class Citacao {

  private long   id;
  private String autor;
  private String categoria;
  private String mensagem;
}
