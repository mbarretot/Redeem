package es.nacho.redeem.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Calendar;

@Entity
@Table(name = "employee", uniqueConstraints = @UniqueConstraint(columnNames = "emp_id"))
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="emp_name", nullable = false)
    private String name;

    @Column(name="emp_last_name", nullable = false)
    private String lastName;

    @Column(name="emp_email", nullable = false)
    private String email;

    @Column(name="emp_password", nullable = false)
    private String password;

    @Column(name="emp_cel", nullable = false)
    private String celphone;

    @Column(name="emp_birthday", nullable = false)
    private Calendar birthday;

    @Column(name="emp_balance", nullable = false)
    private Long balance;

    @Column(name="emp_active", nullable = false)
    private Boolean active;

    @Column(name="emp_rol", nullable = false)
    private String rol;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Purchase> purchases;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Transfer> tranfers;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Allocation> allocations;

    public Employee(String name, String lastName, String email, String password, String celphone, Calendar birthday, Long balance, Boolean active, String rol) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.celphone = celphone;
        this.birthday = birthday;
        this.balance = balance;
        this.active = active;
        this.rol = rol;
    }

    public Employee() {

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCelphone() {
        return celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}