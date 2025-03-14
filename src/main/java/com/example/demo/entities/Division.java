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
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Long id;

    @Column(name = "division")
    private String division_name;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    //Map to countries table
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false, insertable = false, updatable = false)
    private Country country;

    //Map to customers table
    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    private Set<Customer> customers;

    //Fix for front end not populating Division
    @Column(name = "country_id")
    private Long country_id;
    public void setCountry(Country country) {
        setCountry_id(country.getId());
        this.country = country;
    }
}
