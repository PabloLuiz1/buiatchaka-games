package br.com.pablo.buiatchaka.games.domain.entity

import br.com.pablo.buiatchaka.games.usecase.exception.InvalidGenderException
import org.apache.commons.lang3.StringUtils

enum class GenderParams(val value: String) {
    MALE("MASCULINO"),
    FEMALE("FEMININO");

    companion object {
        fun fromGender(value: String): GenderParams {
            return if (StringUtils.isBlank(value)) {
                throw InvalidGenderException()
            } else {
                values().first { gender -> gender.value == value }
            }
        }
    }
}
