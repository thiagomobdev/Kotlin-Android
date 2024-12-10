enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 120)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 180)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinAvancado))

    val usuario1 = Usuario("Thiago")
    val usuario2 = Usuario("João")

    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    println("Inscritos na formação ${formacaoKotlin.nome}:")
    formacaoKotlin.inscritos.forEach { println(it.nome) }
}
