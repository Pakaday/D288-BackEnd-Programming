package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vacations")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "vacation_id")
    private int vacationId;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    @Getter
    @Setter
    @Column(name = "image_url")
    private String imageUrl;

    @Getter
    @Setter
    @Column(name = "last_update")
    private String lastUpdate;

    @Getter
    @Setter
    @Column(name = "travel_fare_price")
    private double travelFarePrice;

    @Getter
    @Setter
    @Column(name = "vacation_title")
    private String vacationTitle;
}
