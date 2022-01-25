package br.com.pablo.buiatchaka.games.adapter.service

import br.com.pablo.buiatchaka.games.adapter.repository.CustomerRepository
import br.com.pablo.buiatchaka.games.factory.CustomerDtoFactory
import br.com.pablo.buiatchaka.games.factory.CustomerFactory
import br.com.pablo.buiatchaka.games.usecase.constant.ONCE
import br.com.pablo.buiatchaka.games.usecase.exception.InvalidLoginException
import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.verify
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.extension.ExtendWith
import java.util.Optional

@ExtendWith(MockKExtension::class)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class CustomerServiceTest {
    private val customerRepositoryMock = mockk<CustomerRepository>()
    private val customerFactory = CustomerFactory()
    private val customerDtoFactory = CustomerDtoFactory()
    private val customerService = CustomerService(customerRepositoryMock)
    private val customer = customerFactory.create()
    private val customerDto = customerDtoFactory.create()

    @Test
    fun mustLoginWithSuccess() {
        every { customerRepositoryMock.findCustomerByEmailAndPassword(any(), any()) } returns Optional.of(customer)

        customerService.login(customerDto)

        verify(exactly = ONCE) { customerRepositoryMock.findCustomerByEmailAndPassword(any(), any()) }
    }

    @Test
    fun mustLoginWithInvalidLoginWithError() {
        every { customerRepositoryMock.findCustomerByEmailAndPassword(any(), any()) } returns Optional.empty()

        Assert.assertThrows(InvalidLoginException::class.java) {
            customerService.login(customerDto)
        }

        verify(exactly = ONCE) { customerRepositoryMock.findCustomerByEmailAndPassword(any(), any()) }
    }
}
