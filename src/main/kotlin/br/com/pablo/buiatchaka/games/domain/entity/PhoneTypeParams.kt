package br.com.pablo.buiatchaka.games.domain.entity

import br.com.pablo.buiatchaka.games.usecase.exception.InvalidPhoneTypeException
import org.apache.commons.lang3.StringUtils

enum class PhoneTypeParams(val value: String) {
    HOME("FIXO"),
    CELL_PHONE("CELULAR");

    companion object {
        fun fromPhoneType(value: String): PhoneTypeParams {
            return if (StringUtils.isBlank(value)) {
                throw InvalidPhoneTypeException()
            } else {
                values().first { type -> type.value == value }
            }
        }
    }
}
