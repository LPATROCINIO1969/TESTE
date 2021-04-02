package one.digitalone.digionebank.testes

import one.digitalone.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val Joao = Funcionario(nome="João",cpf="33434535",salario = BigDecimal.valueOf(4300.50))
    println(Joao.nome)
    println(Joao.cpf)
    println(Joao.salario)
}