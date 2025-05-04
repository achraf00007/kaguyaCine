package net.elmardi.catalogservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity @Getter @Setter @NoArgsConstructor
public class Genre {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreId;

    @Column(nullable = false, unique = true, length = 60)
    private String name;

    @ManyToMany(mappedBy = "genres")
    private Set<Movie> movies;
}
