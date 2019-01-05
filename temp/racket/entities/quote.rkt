#lang racket/base

(require racket/list)


;; Representa a entidade Citação (Quote)
;;  - define os elementos de uma citação: id, categoria, texto e autor
;;  - define uma estrutura para o repositório de citações
;;
;; autor: Marcelo dos Santos

(provide
 (struct-out quote)
 quote->string)

;; ---

;; =================
;; Data Definitions:

(struct quote (id categoria texto autor))
;; Um Quote é uma estrutura:
;;  (make-quote Integer String String String)
;; interpretação: (make-quote i c t a) representa uma Citação,
;; onde: i é o id;
;;       c é a categoria;
;;       t é o texto; e
;;       a é o autor
(define QUOTE1 (quote 1 "Categoria A" "Texto A" "Autor A"))
(define QUOTE2 (quote 2 "Categoria A" "Texto B" "Autor A"))
(define QUOTE3 (quote 3 "Categoria B" "Texto C" "Autor B"))

#;
(define (fn-for-quote q)
  (... (quote-id q)
       (quote-categoria q)
       (quote-texto q)
       (quote-autor q)))

;; A [List-of Quote] is one of:
;;  - empty
;;  - (cons Quote [List-of Quote]
;; interpretação: representa uma coleção de Quote
(define LOQ1 empty)
(define LOQ2 (list QUOTE1))
(define LOQ3 (list QUOTE1 QUOTE2 QUOTE3))

#;
(define (fn-for-loq loq)
  (cond [(empty? loq) ...]
        [else
         (... (fn-for-quote (first loq))
              (fn-for-loq (rest loq)))]))


;; ==========
;; Functions:

;; Quote -> String
;; Converte uma estrutura Quote no formato String
(define (quote->string q)
  (format "~a.~a: ~s (~a)"
          (quote-id q)
          (quote-categoria q)
          (quote-texto q)
          (quote-autor q)))
