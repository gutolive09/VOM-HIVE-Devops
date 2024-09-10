package br.com.VomHive.VomHive.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record PayResponse(

        Long idPay,

        double value,

        String method,

        LocalDate dtPayment,

        LocalDate dtDue
) {
}
