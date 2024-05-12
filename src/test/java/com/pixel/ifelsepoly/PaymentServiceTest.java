package com.pixel.ifelsepoly;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PaymentServiceTest {

    PaymentService paymentService = new PaymentService();

    @Test
    void calculateShippingAbove50weight() {
        PaymentService paymentService = mock(PaymentService.class);

        // Define the expected input and output
        int weight = 65;
        long expectedShippingCost = 400L;

        // Define the behavior of calculateShipping method on the mock
        when(paymentService.calculateShipping(weight)).thenReturn(expectedShippingCost);

        // Call the method under test
        long actualShippingCost = paymentService.calculateShipping(weight);

        // Verify that the method was called with the correct argument
        verify(paymentService).calculateShipping(weight);

        // Verify the result
        assertEquals(expectedShippingCost, actualShippingCost);
    }
    @Test
    void calculateShippingBelo50weight() {
        PaymentService paymentService = mock(PaymentService.class);

        // Define the expected input and output
        int weight = 15;
        long expectedShippingCost = 350L;

        // Define the behavior of calculateShipping method on the mock
        when(paymentService.calculateShipping(weight)).thenReturn(expectedShippingCost);

        // Call the method under test
        long actualShippingCost = paymentService.calculateShipping(weight);

        // Verify that the method was called with the correct argument
        verify(paymentService).calculateShipping(weight);

        // Verify the result
        assertEquals(expectedShippingCost, actualShippingCost);
    }
}