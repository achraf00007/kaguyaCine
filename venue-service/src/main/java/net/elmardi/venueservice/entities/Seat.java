package net.elmardi.venueservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor
public class Seat {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seatId;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(nullable = false)
    private Theater theater;

    private String rowLabel;
    private Integer seatNumber;
    private String seatType = "STD";   // VIP, Duo-sofa…
}
