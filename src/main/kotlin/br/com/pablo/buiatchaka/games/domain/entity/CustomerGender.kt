package br.com.pablo.buiatchaka.games.domain.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class CustomerGender(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long? = null,

    @Column(nullable = false)
    val description: String
) {
    @ManyToOne
    val deleteStatus: DeleteStatus = DeleteStatus()

    @Column(nullable = false)
    val createdDate: LocalDateTime = LocalDateTime.now()

    @Column(nullable = false)
    val updatedDate: LocalDateTime = LocalDateTime.now()
}
