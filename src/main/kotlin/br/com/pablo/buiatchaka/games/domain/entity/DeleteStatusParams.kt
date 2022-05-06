package br.com.pablo.buiatchaka.games.domain.entity

import br.com.pablo.buiatchaka.games.usecase.exception.InvalidDeleteStatusException
import org.apache.commons.lang3.StringUtils

enum class DeleteStatusParams(val value: String) {
    ACTIVE("Ativo"),
    DISABLED("Excluído"),
    SOLD_OFF("Esgotado");

    companion object {
        fun fromDeleteStatus(value: String): DeleteStatusParams {
            return if (StringUtils.isBlank(value)) {
                throw InvalidDeleteStatusException()
            } else {
                values().first { status -> status.value == value }
            }
        }
    }
}
