package es.nacho.redeem.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name="allocation")
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "al_id")
    private Long id;

    @Column(name="al_datetime")
    private LocalDateTime datetime;

    @Column(name="al_amount")
    private Integer amount;

    @Column(name="al_description")
    private String description;

    public Allocation(LocalDateTime datetime, Integer amount, String description, Collection<Allocation> allocations) {
        this.datetime = datetime;
        this.amount = amount;
        this.description = description;
    }

    public Allocation() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}