package br.com.pablo.buiatchaka.games.factory

import br.com.pablo.buiatchaka.games.domain.dto.CustomerDto

class CustomerDtoFactory {

    companion object {
        private const val ID = 1L
        private const val EMAIL = "josedasilva@gmail.com"
        private const val PASSWORD = "jose123"
    }

    fun create(): CustomerDto {
        return CustomerDto(id = ID, email = EMAIL, password = PASSWORD)
    }
}
