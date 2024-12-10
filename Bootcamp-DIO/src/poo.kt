//Herança
open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

//Herança com construtor parametrizado
open class Tiger(val origin: String) {
    fun sayHello(){
        println("A tiger from $origin says: grrhhhh!!")
    }
}

class SiberianTiger : Tiger("Siberia")

//Herança passando argumentos de construtor para superclass
open class Lion(val name: String, val origin: String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh!")
    }
}
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    //Herança
    val dog: Dog = Yorkshire()
    dog.sayHello()
    //Herança com parametros
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
    //Passando os argumentos de construtor
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}