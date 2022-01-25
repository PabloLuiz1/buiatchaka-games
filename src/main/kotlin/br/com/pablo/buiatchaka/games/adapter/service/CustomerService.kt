package br.com.pablo.buiatchaka.games.adapter.service

import br.com.pablo.buiatchaka.games.adapter.repository.CustomerRepository
import br.com.pablo.buiatchaka.games.domain.dto.CustomerDto
import br.com.pablo.buiatchaka.games.domain.entity.Customer
import br.com.pablo.buiatchaka.games.usecase.exception.InvalidLoginException
import br.com.pablo.buiatchaka.games.usecase.exception.ObjectNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    fun login(customerDto: CustomerDto): Customer {
        val customer = customerRepository.findCustomerByEmailAndPassword(customerDto.email, customerDto.password)
        return if (customer.isEmpty) {
            throw InvalidLoginException()
        } else {
            customer.get()
        }
    }

    fun find(id: Long): Customer {
        val customer = customerRepository.findById(id)
        return if (customer.isEmpty) {
            throw ObjectNotFoundException(Customer::class.java.simpleName, id)
        } else {
            customer.get()
        }
    }

    fun findAll(): List<Customer> {
        return customerRepository.findAll()
    }

    fun save(customer: Customer): Customer {
        return customerRepository.save(customer)
    }
}
