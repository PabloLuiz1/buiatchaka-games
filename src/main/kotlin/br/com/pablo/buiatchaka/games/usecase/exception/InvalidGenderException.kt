package br.com.pablo.buiatchaka.games.usecase.exception

class InvalidGenderException(
    override val message: String = "Gênero inválido"
) : ServiceErrorException(message)
