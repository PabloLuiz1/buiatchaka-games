package br.com.pablo.buiatchaka.games.domain.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Card(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false, updatable = false)
    val number: String,

    @Column(nullable = false, updatable = false)
    val ownerName: String,

    @Column(nullable = false, updatable = false)
    val code: String,

    @Column(nullable = false, updatable = false)
    val ownerCpf: String,

    @ManyToOne
    val network: CardNetwork
)
