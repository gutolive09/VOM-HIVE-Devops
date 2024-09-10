package br.com.VomHive.VomHive.dto.request;

import java.time.LocalDate;

public record ProfileRequest(

        Long idUser,

        String nmUser,

        String passUser,

        String permission,

        String status,

        LocalDate dtRegister


) {
}
