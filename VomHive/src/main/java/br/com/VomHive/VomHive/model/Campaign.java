package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "TBL_CAMPAIGN")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCampaign;

    @Size(min = 4, max = 255, message = "O nome da nova campanha deve ter, ao menos, 4 caracteres e, no máximo, 255")
    private String nmCampaign;

    private String details;

    private String status;

    private String objective;

    private double budget;

    @FutureOrPresent
    private LocalDate term;

    //Relacionamentos (campaign -> company) e (campaign -> product)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company")
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product")
    private Product product;

    @PastOrPresent
    private LocalDate dtRegister;

    public Campaign() {
    }

    public Campaign(Long idCampaign, String nmCampaign, String details, String status, String objective, double budget, LocalDate term, Company company, Product product, LocalDate dtRegister) {
        this.idCampaign = idCampaign;
        this.nmCampaign = nmCampaign;
        this.details = details;
        this.status = status;
        this.objective = objective;
        this.budget = budget;
        this.term = term;
        this.company = company;
        this.product = product;
        this.dtRegister = dtRegister;
    }


    public Long getIdCampaign() {
        return idCampaign;
    }

    public void setIdCampaign(Long idCampaign) {
        this.idCampaign = idCampaign;
    }

    public String getNmCampaign() {
        return nmCampaign;
    }

    public void setNmCampaign(String nmCampaign) {
        this.nmCampaign = nmCampaign;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public LocalDate getTerm() {
        return term;
    }

    public void setTerm(LocalDate term) {
        this.term = term;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getDtRegister() {
        return dtRegister;
    }

    public void setDtRegister(LocalDate dtRegister) {
        this.dtRegister = dtRegister;
    }

}
