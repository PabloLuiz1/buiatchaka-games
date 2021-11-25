package br.com.pablo.buiatchaka.games.factory

import br.com.pablo.buiatchaka.games.domain.dto.CustomerDto

class CustomerDtoFactory {

    companion object {
        private const val EMAIL = "josedasilva@gmail.com"
        private const val PASSWORD = "jose123"
    }

    fun create(): CustomerDto {
        return CustomerDto(email = EMAIL, password = PASSWORD)
    }
}
