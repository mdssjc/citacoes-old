package com.github.mdssjc.citacoes.entities;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe de criação de Quote.
 *
 * @author Marcelo dos Santos
 *
 */
public class Quotes {

  private static final String PATTERN = "([0-9])*\\.?(.*): \"(.*)\" \\((.*)\\)";

  public static Quote of(final String message) {
    return of(message, 0, false);
  }

  public static Quote of(final String message, final long id) {
    return of(message, id, true);
  }

  private static Quote of(final String message, final long id, final boolean idUsed) {
    final Pattern pattern = Pattern.compile(PATTERN);
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
}
