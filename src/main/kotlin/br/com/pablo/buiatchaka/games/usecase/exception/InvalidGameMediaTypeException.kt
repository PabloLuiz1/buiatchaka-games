package br.com.pablo.buiatchaka.games.usecase.exception

class InvalidGameMediaTypeException(
    override val message: String = "Tipo de mídia inválido"
) : ServiceErrorException(message)
