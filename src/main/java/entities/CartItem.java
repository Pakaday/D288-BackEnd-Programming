package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "cart_id")
    private int cartId;

    @Column(name = "vacation_id")
    private int vacationId;

    //Map to Vacation table
    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;

    //Map to Cart table
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    //Map to Excursion table
    @ManyToMany(mappedBy = "cart_items")
    private Set<Excursion> excursions;
}
