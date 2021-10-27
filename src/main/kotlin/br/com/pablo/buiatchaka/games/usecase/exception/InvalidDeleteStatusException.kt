package br.com.pablo.buiatchaka.games.usecase.exception

class InvalidDeleteStatusException(
    override val message: String = "Status de exclusão inválido"
) : ServiceErrorException(message)
