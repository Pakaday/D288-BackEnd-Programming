package entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column(name = "customer_id")
    private int customerId;

    @Getter
    @Setter
    @Column(name = "address")
    private String address;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;

    @Getter
    @Setter
    @Column(name = "customer_first_name")
    private String customerFirstName;

    @Getter
    @Setter
    @Column(name = "customer_last_name")
    private String customerLastName;

    @Getter
    @Setter
    @Column(name = "last_update")
    private String lastUpdate;

    @Getter
    @Setter
    @Column(name = "phone")
    private String phone;

    @Getter
    @Setter
    @Column(name = "postal_code")
    private String postalCode;

    @Getter
    @Setter
    @Column(name = "division_id")
    private int divisionId;
}
