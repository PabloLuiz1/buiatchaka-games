package br.com.pablo.buiatchaka.games.usecase.exception

class InvalidPhoneTypeException(
    override val message: String = "Tipo de telefone inválido"
) : ServiceErrorException(message)
