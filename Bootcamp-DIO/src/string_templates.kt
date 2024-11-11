fun main(){
var customers = 10
    println("There are 10 costumers in the queue!")  //São 10 clientes na fila
    //vamos acrescentar mais quantos cliente quisermos atraves da interpolação das Strings.
    print("How many customers do you want to add to the queue: ")
    var add = readLine()?.toIntOrNull()
    val newQueue = add?.plus(customers)
    println("Now there are ${newQueue} in the queue!")


}


