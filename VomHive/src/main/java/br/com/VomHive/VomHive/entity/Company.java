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
@Table(name = "TBL_COMPANY")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMPANY")
    @SequenceGenerator(name = "SQ_COMPANY", sequenceName = "SQ_COMPANY", allocationSize = 1)

    @Column(name = "ID_COMPANY")
    private Long idCompany;

    @Column(name = "NM_COMPANY")
    private String nmCompany;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "EMAIL")
    private String email;

    //Relacionamento profiles
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "PROFILE", // Nome da coluna de chave estrangeira
            referencedColumnName = "ID_PROFILE",
            foreignKey = @ForeignKey(name = "FK_COMPANY_PROFILE")
    )
    private Profile profiles;

    @Column(name = "DT_REGISTER_COMPANY")
    private LocalDate dtRegister;
}
