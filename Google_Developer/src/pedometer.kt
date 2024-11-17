//Programa que vai medir a queima de calorias com base nos passos dados
fun main(){
    val steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(steps)
    println("Walking $steps, your step burns $caloriesBurned")
}

fun PEDOMETERstepsTOcalories(NumberOFSteps: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFSteps * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}