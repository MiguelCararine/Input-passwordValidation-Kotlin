class UserManager {
    fun getUserInput(): User {
        println("Bom dia, por favor informe seu e-mail")
        print("E-mail: ")
        val email: String = readLine()!!.toString()
        println("o E-mail informado é: ${email.uppercase()}")

        println("Informe um nome de Usuario para o sistema: ")
        print("User: ")
        val user: String = readLine()!!.toString()
        println("User informado é ${user.uppercase()}")

        println("Por favor informe uma senha para sua conta")
        println("A senha deve conter letras maiusculas, caracteres especias e numeros.")
        print("Senha: ")
        val password: String = readLine()!!.toString()

        return User(email.uppercase(), user.uppercase(), password)
    }

    fun validatePassword(user: User) {
        if (user.isValidPassword()) {
            println("Senha válida!")
        } else {
            println("Senha inválida!")
        }
    }
}