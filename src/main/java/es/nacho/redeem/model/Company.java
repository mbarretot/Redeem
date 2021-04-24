package es.nacho.redeem.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "company", uniqueConstraints = @UniqueConstraint(columnNames = "comp_name"))
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comp_id", nullable = false)
    private Long id;

    @Column(name = "comp_name", nullable = false)
    private String name;

    @Column(name = "comp_budget", nullable = false)
    private Long budget;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="company")
    private Collection<Product> products;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy="company")
    private Collection<Area> areas;


    public Company(String name, Long budget) {
        super();
        this.name = name;
        this.budget = budget;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }
}