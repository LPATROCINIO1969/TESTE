package one.digitalone.digionebank

class Cliente(nome:String,
              cpf:String,
              val clienteTipo:ClienteTipo,
              val senha:String):Pessoa(nome, cpf),Logavel {

    override fun login(): Boolean = "amor"== senha
    override fun toString(): String = """
         Nome: $nome
         CPF:  $cpf
         Tipo do cliente: ${clienteTipo.descricao}
         """.trimIndent()
        
    

}