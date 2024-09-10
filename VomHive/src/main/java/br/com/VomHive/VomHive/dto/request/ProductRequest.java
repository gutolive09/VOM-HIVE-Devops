package br.com.VomHive.VomHive.dto.request;

public record ProductRequest(

        Long idProduct,

        String target,

        String nmProduct,

        String differential,

        double price,

        String salesChannel
) {
}
