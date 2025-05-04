package net.elmardi.userservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.OffsetDateTime;

@Entity @Getter @Setter @NoArgsConstructor
public class Watchlist {

    @EmbeddedId
    private WatchlistId id;

    private OffsetDateTime addedAt = OffsetDateTime.now();
}
