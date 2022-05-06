package br.com.pablo.buiatchaka.games.domain.entity

import javax.persistence.Embeddable
import javax.persistence.ManyToOne

@Embeddable
class ProductPriceDetails(

    @ManyToOne
    val pricing: ProductPricing,

    val barCode: String,

    val buyPrice: Double,

    val sellPrice: Double
)
