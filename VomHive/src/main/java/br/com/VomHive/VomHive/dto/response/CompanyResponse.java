package br.com.VomHive.VomHive.dto.response;

import br.com.VomHive.VomHive.dto.request.AbstractRequest;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record CompanyResponse(

        Long idCompany,

        String nmCompany,

        String cnpj,

        String email,

        ProfileResponse profiles,

        LocalDate dtRegister
) {
}
