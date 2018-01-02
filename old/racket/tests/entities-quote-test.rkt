#lang racket/base

(require rackunit)
(require rackunit/text-ui)
(require "../entities/quote.rkt")

(define QUOTE1 (quote 1 "Categoria" "Texto" "Autor"))

(define quote-tests
  (test-suite
   "Testes com o Quote"

   (test-case "Teste simples"
     (check-equal? (quote->string QUOTE1) "1.Categoria: \"Texto\" (Autor)"))))

(module+ test
  (run-tests quote-tests))
