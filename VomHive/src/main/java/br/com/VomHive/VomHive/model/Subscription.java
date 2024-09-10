package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_SUBSCRIPTION")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubscription;

    private double value;

    private String status;

    //Relacionamentos (subscription -> pay) e (subscription -> company)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pay")
    private Pay payments;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company")
    private Company company;

    private LocalDate dtStart;

    private LocalDate dtEnd;

    public Subscription() {
    }

    public Subscription(Long idSubscription, double value, String status, Pay payments, Company company, LocalDate dtStart, LocalDate dtEnd) {
        this.idSubscription = idSubscription;
        this.value = value;
        this.status = status;
        this.payments = payments;
        this.company = company;
        this.dtStart = dtStart;
        this.dtEnd = dtEnd;
    }

    public Long getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(Long idSubscription) {
        this.idSubscription = idSubscription;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pay getPayments() {
        return payments;
    }

    public void setPayments(Pay payments) {
        this.payments = payments;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public LocalDate getDtStart() {
        return dtStart;
    }

    public void setDtStart(LocalDate dtStart) {
        this.dtStart = dtStart;
    }

    public LocalDate getDtEnd() {
        return dtEnd;
    }

    public void setDtEnd(LocalDate dtEnd) {
        this.dtEnd = dtEnd;
    }
}
