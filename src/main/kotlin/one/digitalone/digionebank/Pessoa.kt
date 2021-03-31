package one.digitalone.digionebank

class Pessoa {
    var nome: String = "Lucio"
    var cpf: String = "123.123.123-45"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "rua teste"
    }


}

fun main() {
    val Joao = Pessoa()
//    Joao.cpf="343453"
    println(Joao.pessoaInfo())
    println(Joao.Endereco().rua)
}