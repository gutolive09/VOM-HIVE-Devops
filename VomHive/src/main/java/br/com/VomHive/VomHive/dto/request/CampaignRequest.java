package br.com.VomHive.VomHive.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record CampaignRequest(

        @Positive
        @NotNull
        Long idCampaign,

        String nmCampaign,

        byte[] details,

        String status,

        String objective,

        double budget,

        String term,

        AbstractRequest company,

        AbstractRequest product,

        LocalDate dtRegister



) {
}
