package br.com.VomHive.VomHive.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "TBL_PROFILE")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    private String nmUser;

    private String passUser;

    private String permission;

    private String status;

    private LocalDate dtRegister;

    public Profile() {
    }

    public Profile(Long idUser, String nmUser, String passUser, String permission, String status, LocalDate dtRegister) {
        this.idUser = idUser;
        this.nmUser = nmUser;
        this.passUser = passUser;
        this.permission = permission;
        this.status = status;
        this.dtRegister = dtRegister;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setNmUser(String nmUser) {
        this.nmUser = nmUser;
    }

    public void setPassUser(String passUser) {
        this.passUser = passUser;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDtRegister(LocalDate dtRegister) {
        this.dtRegister = dtRegister;
    }
}
