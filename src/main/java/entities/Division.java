package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "division")
    private String division;

    @Getter
    @Setter
    @Column(name = "division_id")
    private Long divisionId;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;

    @Getter
    @Setter
    @Column(name = "last_update")
    private String lastUpdate;

    @Getter
    @Setter
    @Column(name = "country_id")
    private int countryId;
}
