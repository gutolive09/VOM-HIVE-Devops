package br.com.VomHive.VomHive.dto.request;

import java.time.LocalDate;

public record SubscriptionRequest(

        Long idSubscription,

        double value,

        String status,

        AbstractRequest payments,

        AbstractRequest company,

        LocalDate dtStart,

        LocalDate dtEnd
) {
}
