package br.com.pablo.buiatchaka.games.usecase.exception

class InvalidLoginException(
    override val message: String = "Dados de login inválidos"
) : ServiceErrorException(message)
