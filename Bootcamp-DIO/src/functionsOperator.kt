fun main(){
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "Bye ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "Estude sempre! Mesmo que for um pouco por dia."
    println(str[0..15])
}