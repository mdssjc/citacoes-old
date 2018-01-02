package com.github.mdssjc.citacoes.base;

import java.util.Optional;

/**
 * Operações da execução principal.
 *
 * @author Marcelo dos Santos
 *
 */
public enum Operation {
  SINGLE(""),
  LOOP("loop");

  Operation(final String value) {
  }

  public static Operation fromString(final String value) {
    final Optional<String> v = Optional.ofNullable(value);
    if (v.isPresent()) {
      for (final Operation op : Operation.values()) {
        if (v.get()
             .equalsIgnoreCase(op.toString())) {
          return op;
        }
      }
    }
    return SINGLE;
  }
}
