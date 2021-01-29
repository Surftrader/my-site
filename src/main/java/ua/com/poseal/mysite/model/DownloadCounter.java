package ua.com.poseal.mysite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "download_counters")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id", "fileName"})
public class DownloadCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "download_counter")
    private Long counter;

}
