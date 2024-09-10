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
@Table(name = "TBL_CAMPAIGN")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CAMPAIGN")
    @SequenceGenerator(name = "SQ_CAMPAIGN", sequenceName = "SQ_CAMPAIGN", allocationSize = 1)

    @Column(name = "ID_CAMPAIGN")
    private Long idCampaign;

    @Column(name = "NM_CAMPAIGN")
    private String nmCampaign;

    @Column(name = "DETAILS")
    private byte[] details;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "OBJECTIVE")
    private String objective;

    @Column(name = "BUDGET")
    private double budget;

    @Column(name = "TERM")
    private String term;

    //Relacionamentos (campaign -> company) e (campaign -> product)
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "COMPANY", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_COMPANY",
            foreignKey = @ForeignKey(name = "FK_CAMPAIGN_COMPANY")
    )
    private Company company;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PRODUCT", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_PRODUCT",
            foreignKey = @ForeignKey(name = "FK_CAMPAIGN_PRODUCT")
    )
    private Product product;

    @Column(name = "DT_REGISTER_CAMPAIGN")
    private LocalDate dtRegister;
}
