package com.example.LoginApp3.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "income")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Local_Date")
    private java.time.LocalDate LocalDate;;

    @Column(name = "income_Price")
    private float incomePrice;

    @Column(name="income_Subject")
    private String incomeSubject;

    @Column(name="type_Cost")
    private String typeCost;

    @Column(name="price_Cost")
    private float priceCost;

    @Column(name="cost_Subject")
    private String costSubject;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.time.LocalDate getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(java.time.LocalDate localDate) {
        LocalDate = localDate;
    }

    public float getIncomePrice() {
        return incomePrice;
    }

    public void setIncomePrice(float incomePrice) {
        this.incomePrice = incomePrice;
    }

    public String getIncomeSubject() {
        return incomeSubject;
    }

    public void setIncomeSubject(String incomeSubject) {
        this.incomeSubject = incomeSubject;
    }

    public String getTypeCost() {
        return typeCost;
    }

    public void setTypeCost(String typeCost) {
        this.typeCost = typeCost;
    }

    public float getPriceCost() {
        return priceCost;
    }

    public void setPriceCost(float priceCost) {
        this.priceCost = priceCost;
    }

    public String getCostSubject() {
        return costSubject;
    }

    public void setCostSubject(String costSubject) {
        this.costSubject = costSubject;
    }
}
