import java.awt.SecondaryLoop

data class User(val name: String, val id: Int){
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main(){
    val user = User("Thiago", 1)
    println(user)
    val secondUser = User("Carol", 2)
    val thirdUser = User("Emanuel",3)
    val fourUser = User("Bruce",4)
    println("The list users: $user, $secondUser, $thirdUser, $fourUser")

    println("User == SecondUser: ${user == secondUser}")
    println("thirdUser == fourUser: ${thirdUser == fourUser}")
    //Hashcode function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())
    println(fourUser.hashCode())

    //copy funcition
    println(user.copy())
    println(user === user.copy())
    println(user.copy("Bruce"))
    println(user.copy(id = 2))

    println("Name = ${user.component1()}")
    println("Id = ${user.component2()}")
}