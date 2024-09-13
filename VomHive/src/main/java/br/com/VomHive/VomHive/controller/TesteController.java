package br.com.VomHive.VomHive.controller;

import br.com.VomHive.VomHive.model.Campaign;
import br.com.VomHive.VomHive.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TesteController {

    @Autowired
    private CampaignRepository campaignRep;

    @Autowired
    private CompanyRepository companyRep;

    @Autowired
    private PayRepository payRep;

    @Autowired
    private ProductRepository productRep;

    @Autowired
    private ProfileRepository profileRep;

    @Autowired
    private SubscriptionRepository subscriptionRep;

    @GetMapping("/teste")
    public String retornarPagina(Model model) {
        List<Campaign> campaigns = campaignRep.findAll();
        model.addAttribute("campaigns", campaigns);
        return "pagina";
    }

    @GetMapping("/campaign/new")
    public String showAddCampaignForm(Model model) {
        model.addAttribute("campaign", new Campaign());
        return "addCampaign";
    }

    @PostMapping("/campaign/add")
    public String addCampaign(@ModelAttribute("campaign") Campaign campaign) {
        campaignRep.save(campaign);
        return "redirect:/teste";
    }

    @GetMapping("/campaign/delete/{id}")
    public String deleteCampaign(@PathVariable("id") Long id) {
        campaignRep.deleteById(id);
        return "redirect:/teste";
    }
}
