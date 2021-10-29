package br.com.pablo.buiatchaka.games.adapter.controller

import br.com.pablo.buiatchaka.games.adapter.service.CustomerService
import br.com.pablo.buiatchaka.games.domain.dto.CustomerDto
import br.com.pablo.buiatchaka.games.domain.entity.Customer
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
    private val customerService: CustomerService
) {

    @PostMapping("/login")
    fun login(@RequestBody customerDto: CustomerDto): ResponseEntity<Customer> {
        return ResponseEntity.ok().body(customerService.login(customerDto))
    }
}
