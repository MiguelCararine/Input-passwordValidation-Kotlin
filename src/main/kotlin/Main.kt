fun main() {
    val userManager = UserManager()
    val user = userManager.getUserInput()
    userManager.validatePassword(user)
}