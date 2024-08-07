package phc.rest_api_dev_week.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    //@Column(scale = 13, precision = 2)
    @Column(precision = 2)
    private BigDecimal balance;

    //@Column(scale = 13, precision = 2)
    @Column(precision = 2)
    private BigDecimal additional_limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getLimit() {
        return additional_limit;
    }

    public void setLimit(BigDecimal limit) {
        this.additional_limit = limit;
    }
}
