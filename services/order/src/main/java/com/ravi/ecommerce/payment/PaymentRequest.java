package com.ravi.ecommerce.payment;

import com.ravi.ecommerce.customer.CustomerResponse;
import com.ravi.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
