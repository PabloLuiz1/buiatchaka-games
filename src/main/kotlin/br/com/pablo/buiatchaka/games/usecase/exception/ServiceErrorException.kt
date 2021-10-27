package br.com.pablo.buiatchaka.games.usecase.exception

import java.lang.RuntimeException

open class ServiceErrorException(message: String) : RuntimeException(message)
