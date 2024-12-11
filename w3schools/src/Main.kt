//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //4. Faça um programa que exiba os números de 1 a 100, mas pule múltiplos de 5.
    fun tableFake(product: String, values: Double) {
        println("%-15s %10.2f".format(product, values))
    }
    println("%-15s %10.2f".format("PRODUCT", "PRICES"))
    println("------------------------")
    tableFake("Rice", 7.99)
}