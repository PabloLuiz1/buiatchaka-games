package br.com.pablo.buiatchaka.games.usecase.exception

class ObjectNotFoundException(entity: String, id: Long, override val message: String = entity + " com iD: " + id + " não encontrado(a). ") : ServiceErrorException(message)
