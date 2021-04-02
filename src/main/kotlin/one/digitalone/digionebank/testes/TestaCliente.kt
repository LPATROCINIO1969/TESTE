package one.digitalone.digionebank.testes

import one.digitalone.digionebank.Cliente
import one.digitalone.digionebank.ClienteTipo


fun main() {
    val jose= Cliente(nome="Manoel Ferreira", cpf="9987876",clienteTipo=ClienteTipo.PF, senha="amor")
    println(jose)
    TestaAutenticacao().autentica(jose)
}