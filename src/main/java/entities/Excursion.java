package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "excursions")
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    private Long id;

    @Column(name = "create_date")
    private String createDate;
    
    @Column(name = "excursion_price")
    private double excursionPrice;

    @Column(name = "excursion_title")
    private String excursionTitle;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "vacation_id")
    private int vacationId;

    //Map to vacations table
    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    //Map to cart_items table
    @ManyToMany(mappedBy = "excursions")
    private Set<CartItem> cartItems;
}
