package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "excursions")
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "excursion_id")
    private int excursionId;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;

    @Getter
    @Setter
    @Column(name = "excursion_price")
    private double excursionPrice;

    @Getter
    @Setter
    @Column(name = "excursion_title")
    private String excursionTitle;

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
    @Column(name = "vacation_id")
    private int vacationId;
}
