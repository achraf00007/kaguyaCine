package net.elmardi.userservice.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class WatchlistId implements java.io.Serializable {
    private Long userId;
    private Long movieId;
}
