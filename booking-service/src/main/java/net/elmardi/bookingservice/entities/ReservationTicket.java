package net.elmardi.bookingservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor
public class ReservationTicket {

    @EmbeddedId
    private ReservationTicketId id;

    @ManyToOne(fetch = FetchType.LAZY) @MapsId("reservationId")
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.LAZY) @MapsId("ticketId")
    private Ticket ticket;
}
