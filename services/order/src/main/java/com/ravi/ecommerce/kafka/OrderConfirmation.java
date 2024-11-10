package com.ravi.ecommerce.kafka;

import com.ravi.ecommerce.customer.CustomerResponse;
import com.ravi.ecommerce.order.PaymentMethod;
import com.ravi.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
