package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long id;

    @Column(name = "package_price")
    private double packagePrice;
    
    @Column(name = "party_size")
    private int partySize;

    @Column(name = "status")
    private String status;

    @Enumerated(EnumType.STRING)
    private StatusType statusType;

    @Column(name = "order_tracking_number")
    private String orderTrackingNumber;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "customer_id")
    private int customerId;

    //Map to customers table
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    //Map to cart_items table
    @OneToMany(mappedBy = "carts", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CartItem> cartItems;
}
