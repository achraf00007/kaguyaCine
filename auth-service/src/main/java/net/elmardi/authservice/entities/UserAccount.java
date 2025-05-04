package net.elmardi.authservice.entities;


import jakarta.persistence.*;
import lombok.*;
import net.elmardi.authservice.enums.UserRole;

@Entity
@Table(name = "user_account")
@Getter @Setter @NoArgsConstructor
public class UserAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true, length = 120)
    private String email;

    @Column(nullable = false, length = 60)
    private String pwdHash;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    private String firstName;
    private String lastName;
}
