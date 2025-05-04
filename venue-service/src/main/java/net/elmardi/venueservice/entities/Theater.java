package net.elmardi.venueservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity @Getter @Setter @NoArgsConstructor
public class Theater {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long theaterId;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(nullable = false)
    private Cinema cinema;

    private String name;            // “IMAX”, “Salle 1”…
    private Integer capacity;
    private String techFormat;      // IMAX, 4DX, Dolby…

    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    private Set<Seat> seats;
}
