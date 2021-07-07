package com.jmhreif.sdnvenmosocial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentRepo paymentRepo;

    public PaymentController(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @GetMapping()
    Iterable<Payment> findSomePayments() { return paymentRepo.findSomePayments(); }
}
