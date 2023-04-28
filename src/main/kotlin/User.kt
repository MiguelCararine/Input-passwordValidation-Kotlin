class User(val email: String, val username: String, val password: String) {
    fun isValidPassword(): Boolean {
        val pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$"
        return password.matches(pattern.toRegex())
    }
}