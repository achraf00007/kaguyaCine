package net.elmardi.catalogservice.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.Set;

@Entity @Getter @Setter @NoArgsConstructor
public class Movie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;

    private String title;
    private String originalTitle;
    private LocalDate releaseDate;
    private Short durationMin;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    private String posterUrl;
    private String trailerUrl;
    private String ageRating;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private Set<MovieVersion> versions;

    @ManyToMany
    @JoinTable(name = "movie_genre",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id"))
    private Set<Genre> genres;
}
