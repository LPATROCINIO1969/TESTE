package one.digitalone.digionebank

class Pessoa {
    var nome: String = "Lucio"
    var cpf: String = "123.123.123-45"
    private set

    inner class Endereco {
        var rua: String = "rua teste"
    }


}

fun main() {
    val Joao = Pessoa()
//    Joao.cpf="343453"
    println(Joao.nome)
    println(Joao.cpf)
    println(Joao.Endereco().rua)
}