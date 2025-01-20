fun main() {
   var exercise = """
       Classifique os dados especificados, a seguir, de acordo com seu tipo, assinalando
       com (I) os dados do tipo INTEIRO, com (R) os REAIS, com (L) os LITERAIS, com
       (B) os LÓGICOS (booleanos), e com (N) aqueles para os quais não é possível, a
       priori, definir um tipo de dado do ponto de vista computacional.
       
       (i) 0		    (r) –0.001	    	(l) –0.0
       (i) 1		    (r) +0.05		  	(b) .V.
       (r) 0.0			(r) +3257			(b)V
       (r) 0.			(l) “a”				(l) ‘abc’
       (i) –1			(l) “+3257”			(b)F
       (i) –32			(l) ‘+3257.’		(b) .F
       (i) +36			(l) “–0.0”			(l) “V”
       (r) +32.		(l) ‘.F.’			(b) .F.
       
   """.trimIndent()

    println(exercise)
}