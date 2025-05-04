package net.elmardi.paymentservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import net.elmardi.paymentservice.enums.PaymentStatus;

@Entity @Getter @Setter @NoArgsConstructor
public class Payment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    private Long reservationId;

    private String provider;
    private BigDecimal amount;
    private OffsetDateTime paidAt;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status = PaymentStatus.SUCCESS;
}
