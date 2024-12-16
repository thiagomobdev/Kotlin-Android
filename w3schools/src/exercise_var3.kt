fun main(){
    //Escreva um programa que troque os valores de duas variáveis sem usar uma variável auxiliar.
    var changeVar1 = "Thiago"
    var changeVar2 = "Santos"
    println("Antes da troca: changeVar1 = $changeVar1, changeVar2 = $changeVar2")

    val (newVar1, newVar2) = Pair(changeVar2, changeVar1)
    changeVar1 = newVar1
    changeVar2 = newVar2

    println("Depois da troca: changeVar1 = $changeVar1, changeVar2 = $changeVar2")
}