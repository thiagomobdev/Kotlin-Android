fun main(){
    cases(2)
    cases(1)
    cases(0L)
    cases(myClass())
    cases("hello")


}


fun cases (obj: Any){
    when(obj){
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Is long")
        !is String -> println("Not a string")
        else -> println("Unknow")
    }
}

class myClass {

}