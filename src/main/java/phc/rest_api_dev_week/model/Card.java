package phc.rest_api_dev_week.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    //@Column(scale = 13, precision = 2)
    @Column(precision = 13, scale = 2)
    private BigDecimal available_limit;

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

    public BigDecimal getLimit() {
        return available_limit;
    }

    public void setLimit(BigDecimal limit) {
        this.available_limit = limit;
    }
}
