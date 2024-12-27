fun main(){
//    var myFavoriteActor: String? = "Leonardo Di Caprio"
//    println(myFavoriteActor?.length)
//
//    myFavoriteActor = null
//    println(myFavoriteActor)
print("Digite o nome do ator/atriz")
    val actor: String? = readlnOrNull()
    if(actor != null) {
        println("This actor is null!")
    }else{
        println("Do you like $actor!")
    }
}
