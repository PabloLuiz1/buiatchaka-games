package br.com.pablo.buiatchaka.games.domain.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String = "Padrão",

    @Column(nullable = false)
    val street: String,

    @Column(nullable = false)
    val number: String,

    @Column(nullable = false)
    val zipCode: String,

    @Column(nullable = false)
    val district: String,

    @Column(nullable = false)
    val city: String,

    @Column(nullable = false)
    val state: String,

    @Column(nullable = false)
    val complement: String,

    @ManyToOne
    val customer: Customer,

    @ManyToOne
    val deleteStatus: DeleteStatus? = null
) {
    @Column(nullable = false)
    val createdDate: LocalDateTime = LocalDateTime.now()

    @Column(nullable = false)
    val updatedDate: LocalDateTime = LocalDateTime.now()
}
