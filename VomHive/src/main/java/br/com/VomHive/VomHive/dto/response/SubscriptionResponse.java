package br.com.VomHive.VomHive.dto.response;

import br.com.VomHive.VomHive.dto.request.AbstractRequest;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record SubscriptionResponse(

        Long idSubscription,

        double value,

        String status,

        PayResponse payments,

        CompanyResponse company,

        LocalDate dtStart,

        LocalDate dtEnd
) {
}
