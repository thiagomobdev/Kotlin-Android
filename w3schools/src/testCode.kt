fun main(){
    fun counterNumber(text: String): Int{
        val convertText = text.toLowerCase()

        return convertText.count{it in "123"}
    }

    print("Entered numbers: ")
    var numbers = readlnOrNull()
    println(counterNumber("$numbers"))
}