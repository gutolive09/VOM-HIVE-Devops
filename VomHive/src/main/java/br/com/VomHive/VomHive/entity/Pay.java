package br.com.VomHive.VomHive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_PAY")
public class Pay {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PAY")
    @SequenceGenerator(name = "SQ_PAY", sequenceName = "SQ_PAY", allocationSize = 1)

    @Column(name = "ID_PAY")
    private Long idPay;

    @Column(name = "VALUE")
    private double value;

    @Column(name = "METHOD")
    private String method;

    @Column(name = "DT_PAYMENT")
    private LocalDate dtPayment;

    @Column(name = "DT_DUE")
    private LocalDate dtDue;
}
