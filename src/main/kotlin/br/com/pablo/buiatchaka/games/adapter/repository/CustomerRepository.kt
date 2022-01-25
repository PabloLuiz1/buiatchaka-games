package br.com.pablo.buiatchaka.games.adapter.repository

import br.com.pablo.buiatchaka.games.domain.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
    fun findCustomerByEmailAndPassword(email: String, password: String): Optional<Customer>
}
