package br.com.VomHive.VomHive.dto.request;

import java.time.LocalDate;

public record PayRequest(

        Long idPay,

        double value,

        String method,

        LocalDate dtPayment,

        LocalDate dtDue
) {
}
