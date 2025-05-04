package net.elmardi.bookingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
import net.elmardi.bookingservice.enums.ReservationStatus;

@Entity @Getter @Setter @NoArgsConstructor
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private Long userId;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status = ReservationStatus.PENDING;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private Set<ReservationTicket> tickets;
}
