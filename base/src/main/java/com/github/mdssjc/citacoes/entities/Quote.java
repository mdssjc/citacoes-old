package com.github.mdssjc.citacoes.entities;

import lombok.Data;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

  public static Quote of(final String message) {
    return of(message, 0, false);
  }

  public static Quote of(final String message, final int id) {
    return of(message, id, true);
  }

  private static Quote of(final String message, final int id, final boolean idUsed) {
    final Pattern pattern = Pattern.compile("([0-9])*\\.?(.*): \"(.*)\" \\((.*)\\)");
    final Matcher matcher = pattern.matcher(message);
    matcher.matches();

    final Quote quote = new Quote();
    quote.setId(idUsed ? id
                       : Long.parseLong(Optional.ofNullable(matcher.group(1))
                                                .orElse("0")));
    quote.setCategoria(matcher.group(2));
    quote.setTexto(matcher.group(3));
    quote.setAutor(matcher.group(4));

    return quote;
  }

  @Override
  public String toString() {
    return String.format("%d.%s: \"%s\" (%s)%n",
                         getId(), getCategoria(),
                         getTexto(), getAutor());
  }
}
