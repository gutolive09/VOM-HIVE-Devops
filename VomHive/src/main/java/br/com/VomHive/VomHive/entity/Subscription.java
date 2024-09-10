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
@Table(name = "TBL_SUBSCRIPTION")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SUBSCRIPTION")
    @SequenceGenerator(name = "SQ_SUBSCRIPTION", sequenceName = "SQ_SUBSCRIPTION", allocationSize = 1)

    @Column(name = "ID_SUBSCRIPTION")
    private Long idSubscription;

    @Column(name = "VALUE")
    private double value;

    @Column(name = "STATUS")
    private String status;

    //Relacionamentos (subscription -> pay) e (subscription -> company)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PAY", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_PAY",
            foreignKey = @ForeignKey(name = "FK_SUBSCRIPTION_PAY")
    )
    private Pay payments;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "COMPANY", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_COMPANY",
            foreignKey = @ForeignKey(name = "FK_SUBSCRIPTION_COMPANY")
    )
    private Company company;

    @Column(name = "DT_START")
    private LocalDate dtStart;

    @Column(name = "DT_END")
    private LocalDate dtEnd;
}
