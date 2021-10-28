package br.com.pablo.buiatchaka.games.factory

import br.com.pablo.buiatchaka.games.domain.entity.Customer
import br.com.pablo.buiatchaka.games.domain.entity.CustomerGender
import br.com.pablo.buiatchaka.games.domain.entity.DeleteStatus
import br.com.pablo.buiatchaka.games.domain.entity.DeleteStatusParams
import java.time.LocalDate

class CustomerFactory {

    companion object {
        private const val ID = 1L
        private const val NAME = "José da Silva"
        private const val RG = "12.345.678-9"
        private const val CPF = "123.456.789-01"
        private val GENDER = CustomerGender(1L, "Masculino")
        private const val EMAIL = "josedasilva@gmail.com"
        private const val PASSWORD = "jose123"
        private val BIRTH_DATE = LocalDate.of(1999, 8, 31)
        private val DELETE_STATUS = DeleteStatus(1L, DeleteStatusParams.ACTIVE.value)
    }

    fun create(): Customer {
        return Customer(ID, NAME, RG, CPF, GENDER, EMAIL, PASSWORD, BIRTH_DATE, DELETE_STATUS)
    }
}
