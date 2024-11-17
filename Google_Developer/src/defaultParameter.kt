fun main() {
    print("Whats your operation System?: ")
    val operatingSystem = readLine()
    print("Whats your e-mail?: ")
    val emailId = readLine()
    println(displayAlertMessage(operatingSystem.toString(), emailId.toString()))

}
fun displayAlertMessage(os: String, email: String): String{
  //  val msgAlert = "There's a new sign-in request on $os for your Google Account $email"
    return "There's a new sign-in request on [$os] for your Google Account [$email]"
}