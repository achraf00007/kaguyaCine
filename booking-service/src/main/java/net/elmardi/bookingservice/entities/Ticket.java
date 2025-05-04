package net.elmardi.bookingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import net.elmardi.bookingservice.enums.TicketStatus;

@Entity @Getter @Setter @NoArgsConstructor
public class Ticket {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    private Long showtimeId;
    private Long seatId;

    private BigDecimal pricePaid;

    @Enumerated(EnumType.STRING)
    private TicketStatus status = TicketStatus.HELD;
}
