package net.elmardi.bookingservice.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ReservationTicketId implements java.io.Serializable {
    private Long reservationId;
    private Long ticketId;
}
