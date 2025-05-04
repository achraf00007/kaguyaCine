package net.elmardi.venueservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Entity @Getter @Setter @NoArgsConstructor
public class Cinema {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cinemaId;

    private String name;
    private String city;
    private String address;

    @OneToMany(mappedBy = "cinema", cascade = CascadeType.ALL)
    private Set<Theater> theaters;
}
