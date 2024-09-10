package br.com.VomHive.VomHive.dto.request;

import java.time.LocalDate;

public record CompanyRequest(

        Long idCompany,

        String nmCompany,

        String cnpj,

        String email,

        AbstractRequest profiles,

        LocalDate dtRegister
) {
}
