package one.digitalone.digionebank.testes

import one.digitalone.digionebank.Analista
import one.digitalone.digionebank.Funcionario
import one.digitalone.digionebank.ImprimeRelatorioFuncionario
import java.math.BigDecimal



fun main() {
    val Joao = Analista(nome="João",cpf="33434535",salario = 4300.50)

    ImprimeRelatorioFuncionario.imprime(Joao)
}