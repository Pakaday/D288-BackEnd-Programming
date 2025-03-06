package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "country_id")
    private int countryId;

    @Getter
    @Setter
    @Column(name = "country")
    private String country;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;

    @Getter
    @Setter
    @Column(name = "last_update")
    private String lastUpdate;
}
