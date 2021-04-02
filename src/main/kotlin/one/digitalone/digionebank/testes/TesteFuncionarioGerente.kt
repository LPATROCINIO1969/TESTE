package one.digitalone.digionebank.testes

import one.digitalone.digionebank.Analista
import one.digitalone.digionebank.Funcionario
import one.digitalone.digionebank.Gerente
import one.digitalone.digionebank.ImprimeRelatorioFuncionario
import java.math.BigDecimal



fun main() {
    val maria = Gerente(nome="Maria",cpf="33434535",salario = 4300.50)

    ImprimeRelatorioFuncionario.imprime(maria)
}