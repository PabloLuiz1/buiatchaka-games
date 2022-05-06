package br.com.pablo.buiatchaka.games.domain.entity

import javax.persistence.Embeddable
import javax.persistence.ManyToOne

@Embeddable
class GameDetails(
    @ManyToOne
    val platform: GamePlatform,

    @ManyToOne
    val gender: GameGender,

    val minimumAge: Int,

    val numberOfPlayersOff: Int,

    val numberOfPlayersOn: Int,

    @ManyToOne
    val developer: GameDeveloper,

    @ManyToOne
    val mediaType: GameMediaType

    // TODO
    // Criar classe Embeded com os detalhes do Game (caso for):
    // - Plataforma, gênero, faixaEtaria, jogadoresOff, jogadoresOn, desenvolvedora,
    // - TipoDeMidia
)
