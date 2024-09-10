package br.com.VomHive.VomHive.dto.response;

import br.com.VomHive.VomHive.dto.request.AbstractRequest;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record CampaignResponse(

        Long idCampaign,

        String nmCampaign,

        byte[] details,

        String status,

        String objective,

        double budget,

        String term,

        CompanyResponse company,

        ProductResponse product,

        LocalDate dtRegister
) {
}
