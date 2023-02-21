// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO, INTERMEDIARIO, AVANCADO
}

class Usuario(val nome: String, val nivel: Nivel)

class ConteudoEducacional(val nome: String, val duracao: String, val nivel: Nivel)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun mostrarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println("- ${it.nome} - nível: ${it.nivel}") }
    }
}

fun main() {
    val conteudos = listOf(
        ConteudoEducacional("Kotlin Básico", "20 Horas", Nivel.BASICO),
        ConteudoEducacional("Kotlin Intermediário", "30 Horas", Nivel.INTERMEDIARIO),
        ConteudoEducacional("Kotlin Avançado", "40 Horas", Nivel.AVANCADO)
    )

    val usuario1 = Usuario("Victor Hugo", Nivel.INTERMEDIARIO)
    val usuario2 = Usuario("Joelma dos Santos", Nivel.BASICO)
    val usuario3 = Usuario("Alexandre", Nivel.AVANCADO)
