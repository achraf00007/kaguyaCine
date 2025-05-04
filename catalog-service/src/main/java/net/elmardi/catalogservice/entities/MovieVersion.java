package net.elmardi.catalogservice.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor
public class MovieVersion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long versionId;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(nullable = false)
    private Movie movie;

    private String language;   // FR, VO, VOST…
    private String format;     // IMAX, 3D, 4DX…
}
