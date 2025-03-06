package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "cart_item_id")
    private int cartItemId;

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
    @Column(name = "cart_id")
    private int cartId;

    @Getter
    @Setter
    @Column(name = "vacation_id")
    private int vacationId;
}
