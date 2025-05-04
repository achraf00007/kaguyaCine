package net.elmardi.scheduleservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity @Getter @Setter @NoArgsConstructor
public class Showtime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long showtimeId;

    private Long versionId;      // MovieVersion (catalog)
    private Long theaterId;      // Theater (venue)

    private OffsetDateTime startTime;
    private BigDecimal basePrice;
    private Integer ticketsSold = 0;
}
