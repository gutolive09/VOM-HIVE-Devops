package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_PAY")
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPay;

    private double value;

    private String method;

    private LocalDate dtPayment;

    private LocalDate dtDue;

    public Pay() {
    }

    public Pay(Long idPay, double value, String method, LocalDate dtPayment, LocalDate dtDue) {
        this.idPay = idPay;
        this.value = value;
        this.method = method;
        this.dtPayment = dtPayment;
        this.dtDue = dtDue;
    }

    public Long getIdPay() {
        return idPay;
    }

    public void setIdPay(Long idPay) {
        this.idPay = idPay;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public LocalDate getDtPayment() {
        return dtPayment;
    }

    public void setDtPayment(LocalDate dtPayment) {
        this.dtPayment = dtPayment;
    }

    public LocalDate getDtDue() {
        return dtDue;
    }

    public void setDtDue(LocalDate dtDue) {
        this.dtDue = dtDue;
    }
}
