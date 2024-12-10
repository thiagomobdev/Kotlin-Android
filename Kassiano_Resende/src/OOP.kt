fun main(){
    val c = Carro()
    c.cor = "Prata"
    c.modelo = "Nissan 350z"
    c.acelerar()
    c.display()
    val cEspecial = CarroEspecial()
    cEspecial.drifty()

}

class CarroEspecial : Carro(){
    fun drifty(){
        println("Drifting!!!")
    }
}


open class Carro{
    var cor = " "
    var modelo = " "

    fun display(){
        println("Cor: $cor")
        println("Modelo: $modelo")
    }

    fun frear(){
        println("Freando!")
    }
    fun acelerar(){
        println("Acelerando!")
    }
}