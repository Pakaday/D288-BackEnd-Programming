package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "customer_first_name", nullable = false)
    private String firstName;

    @Column(name = "customer_last_name", nullable = false)
    private String lastName;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "postal_code", nullable = false)
    private String postal_code;

    //Map to divisions table
    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    //Map to carts table
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Cart> carts;

    public void add(Cart cart) {
        carts.add(cart);
    }
}
