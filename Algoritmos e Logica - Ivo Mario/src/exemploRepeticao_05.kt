fun main(){
   for(i in 1..5){
       val increment = i + 1
       println("-> Executando o laço EXTERNO - $i vez(es)")
       for (j in 1..3){
           val increment = j + 1
           println("----> Executando o laço INTERNO - $j vez(es)")
       }
   }
}