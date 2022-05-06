package br.com.pablo.buiatchaka.games.domain.entity

import javax.persistence.Column
import javax.persistence.Embedded
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false, columnDefinition = "text")
    val description: String,

    @Embedded
    val gameDetails: GameDetails?,

    @Embedded
    val priceDetails: ProductPriceDetails,

    @ManyToOne
    val type: ProductType
)
