package com.yukam.mypam.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A BenefitLevel.
 */
@Entity
@Table(name = "BENEFIT_LEVEL")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class BenefitLevel implements Serializable {

    public BenefitLevel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "benefit_level_id")
    private long id;

    @Size(min = 1, max = 50)
    private String name;

    @Column(name = "rate")
    private BigDecimal rate;

    @Size(min = 1, max = 500)
    private String description;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        BenefitLevel industrysector = (BenefitLevel) o;

        if (id != industrysector.id) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "IndustrySector{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
