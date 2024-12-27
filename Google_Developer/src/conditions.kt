fun main(){
    print("Qual cor está o sinal?: ")
    val trafficLightColor = readlnOrNull()
//    if(trafficLightColor == "Green"){
//        println("Stop")
//        }else{
//            println("Go!")
//    }

    when(trafficLightColor){
        "Red" -> println("Stop!")
        "Yellow" -> println("Slow!")
        "Green" -> println("Go!")
        else -> println("Não foi indentifacado uma cor.")
    }


}