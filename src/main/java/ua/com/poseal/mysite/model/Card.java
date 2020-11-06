package ua.com.poseal.mysite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Card implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Card(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Column(name = "card_number")
    private Integer cardNumber;
    @Column(name = "card_name")
    private String name;
    @Column(name = "image_path")
    private String path;
    @Column(name = "description")
    private String description;
}
