package entities;

import jakarta.persistence.*;
import lombok.*;

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
    private String division;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "country_id")
    private int countryId;

    //Map to Country table
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    //Map to Customer table
    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Customer> customers;
}
