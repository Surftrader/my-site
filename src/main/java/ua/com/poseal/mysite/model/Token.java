package ua.com.poseal.mysite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tokens")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"token"})
public class Token {

    public Token(String token) {
        this.token = token;
        this.timeCreation = LocalDateTime.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token")
    private String token;

    @Column(name = "time_creation")
    private LocalDateTime timeCreation;
}
