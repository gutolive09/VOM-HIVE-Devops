package br.com.VomHive.VomHive.dto.response;

import lombok.Builder;

@Builder
public record ProductResponse(

        Long idProduct,

        String target,

        String nmProduct,

        String differential,

        double price,

        String salesChannel
) {
}
