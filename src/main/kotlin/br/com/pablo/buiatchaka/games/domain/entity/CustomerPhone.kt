package br.com.pablo.buiatchaka.games.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class CustomerPhone(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @ManyToOne
    val type: PhoneType,

    @Column(nullable = false)
    val areaCode: String,

    @Column(nullable = false)
    val number: String,

    @ManyToOne
    val customer: Customer
)
