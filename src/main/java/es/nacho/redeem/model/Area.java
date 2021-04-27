package es.nacho.redeem.model;

import es.nacho.redeem.model.compositeKeys.AreaKey;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="area")
public class Area {

    @EmbeddedId
    private AreaKey id;


    @ManyToOne
    @MapsId("companyId")
    @JoinColumn(name = "company_comp_id", referencedColumnName = "comp_id", nullable = false)
    private Company company;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "area")
    private Collection<Employee> employees;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "area")
    private Collection<Allocation> allocations;

    public Area(String name, Company company) {
        super();
        this.id = new AreaKey(name, company.getId());
        this.company = company;
    }

    public Area() {
    }

    public AreaKey getId() {
        return id;
    }

    public void setId(AreaKey id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company companyId) {
        this.company = companyId;
    }

    //    public Collection<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Collection<Employee> employees) {
//        this.employees = employees;
//    }
//
//    public Collection<Allocation> getAllocations() {
//        return allocations;
//    }
//
//    public void setAllocations(Collection<Allocation> allocations) {
//        this.allocations = allocations;
//    }
}
