package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vacations")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "travel_fare_price")
    private double travelFarePrice;

    @Column(name = "vacation_title")
    private String vacationTitle;

    //Map to Excursion table
    @OneToMany(mappedBy = "vacation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Excursion> excursions;
}
