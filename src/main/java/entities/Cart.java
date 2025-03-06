package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "cart_id")
    private int cartId;

    @Getter
    @Setter
    @Column(name = "package_price")
    private double packagePrice;

    @Getter
    @Setter
    @Column(name = "party_size")
    private int partySize;

    @Getter
    @Setter
    @Column(name = "status")
    private String status;

    @Getter
    @Setter
    @Column(name = "order_tracking_number")
    private String orderTrackingNumber;

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
    @Column(name = "customer_id")
    private int customerId;
}
