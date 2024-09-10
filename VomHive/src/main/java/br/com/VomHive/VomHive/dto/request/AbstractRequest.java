package br.com.VomHive.VomHive.dto.request;

import jakarta.validation.constraints.Positive;
import org.antlr.v4.runtime.misc.NotNull;

public record AbstractRequest (

        @Positive
        @NotNull
        Long id
){

}
