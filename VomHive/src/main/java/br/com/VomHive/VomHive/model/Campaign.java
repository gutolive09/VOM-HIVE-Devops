package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
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

    private String nmCampaign;

    private byte[] details;

    private String status;

    private String objective;

    private double budget;

    private String term;

    //Relacionamentos (campaign -> company) e (campaign -> product)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company")
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product")
    private Product product;

    private LocalDate dtRegister;

    public Campaign() {
    }

    public Campaign(Long idCampaign, String nmCampaign, byte[] details, String status, String objective, double budget, String term, Company company, Product product, LocalDate dtRegister) {
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

    public byte[] getDetails() {
        return details;
    }

    public void setDetails(byte[] details) {
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

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
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
