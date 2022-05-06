package br.com.pablo.buiatchaka.games.domain.entity

import br.com.pablo.buiatchaka.games.usecase.exception.InvalidGameMediaTypeException
import org.apache.commons.lang3.StringUtils

enum class GameMediaTypeParams(val value: String) {
    PHYSICAL("Física"),
    DIGITAL("Digital");
    companion object {
        fun fromGameMediaType(value: String): GameMediaTypeParams {
            return if (StringUtils.isBlank(value)) {
                throw InvalidGameMediaTypeException()
            } else {
                GameMediaTypeParams.values().first { status -> status.value == value }
            }
        }
    }
}
