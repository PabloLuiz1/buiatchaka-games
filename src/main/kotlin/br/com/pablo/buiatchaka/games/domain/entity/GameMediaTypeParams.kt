package br.com.pablo.buiatchaka.games.domain.entity

import br.com.pablo.buiatchaka.games.usecase.exception.InvalidGameMediaTypeException
import org.apache.commons.lang3.StringUtils

enum class GameMediaTypeParams(val value: String) {
    ACTION("Ação"),
    SIMULATOR("Simulação"),
    SPORTS("Esporte"),
    ADVENTURE("Aventura"),
    FIRST_PERSON_SHOOTER("Tiro em primeira pessoa"),
    INDIE("Indie");

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
