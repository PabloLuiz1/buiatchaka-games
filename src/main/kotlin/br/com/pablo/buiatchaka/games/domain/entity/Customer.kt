package br.com.pablo.buiatchaka.games.domain.entity

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val rg: String,

    @Column(nullable = false)
    val cpf: String,

    @ManyToOne
    val gender: CustomerGender,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String,

    @Column(nullable = false)
    val birthDate: LocalDate,

) {
    @OneToMany(
        mappedBy = "customer",
        cascade = [CascadeType.PERSIST]
    )
    val addresses: MutableList<Address> = mutableListOf()

    @OneToMany(
        mappedBy = "customer",
        cascade = [CascadeType.PERSIST]
    )
    val phones: MutableList<CustomerPhone> = mutableListOf()

    @Column(nullable = false)
    val createdDate: LocalDateTime = LocalDateTime.now()

    @Column(nullable = false)
    val updatedDate: LocalDateTime = LocalDateTime.now()
}
