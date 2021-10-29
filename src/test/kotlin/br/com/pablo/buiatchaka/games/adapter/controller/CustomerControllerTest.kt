package br.com.pablo.buiatchaka.games.adapter.controller

import br.com.pablo.buiatchaka.games.adapter.service.CustomerService
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

@ExtendWith(MockKExtension::class)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class CustomerControllerTest {
    private val customerDto = CustomerDtoFactory().create()
    private val customerServiceMock = mockk<CustomerService>()
    private val customerController = CustomerController(customerServiceMock)
    private val customer = CustomerFactory().create()

    @Test
    fun mustLoginWithSuccess() {
        every { customerServiceMock.login(any()) } returns customer

        customerController.login(customerDto)

        verify(exactly = ONCE) { customerServiceMock.login(any()) }
        verify(exactly = ONCE) { customerController.login(any()) }
    }

    @Test
    fun mustLoginWithError() {
        every { customerServiceMock.login(any()) } throws InvalidLoginException()

        Assert.assertThrows(InvalidLoginException::class.java) { customerController.login(customerDto) }

        verify(exactly = ONCE) { customerServiceMock.login(any()) }
        verify(exactly = ONCE) { customerController.login(any()) }
    }
}
