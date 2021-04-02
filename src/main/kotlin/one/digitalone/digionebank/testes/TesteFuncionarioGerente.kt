package one.digitalone.digionebank.testes

import one.digitalone.digionebank.*


fun main() {
    val maria = Gerente(nome="Maria",cpf="33434535",salario = 4300.50,senha="segredo")

    ImprimeRelatorioFuncionario.imprime(maria)
    TestaAutenticacao().autentica(maria)
}