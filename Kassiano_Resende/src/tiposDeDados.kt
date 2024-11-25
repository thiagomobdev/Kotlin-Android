fun main() {
    val x: Int = 10

    var y: Double = x.toDouble() // Retorna o objeto double a partir do valor de X
    var z: Float = x.toFloat() // Mesma coisa do Double só que retorna Float
    var a: String = x.toString() // Converte em String
    println("\tValor da variavel X = [ $x ]")
    println("Convertendo para Double: [ $y ]")
    println("Convertendo para Float: [ $z ]")
    println("Convertendo para String: [ $a ] ")

    val umMilhao = 1_000_000
    println(umMilhao)

}