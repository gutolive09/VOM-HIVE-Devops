package br.com.VomHive.VomHive.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TBL_PROFILE")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROFILE")
    @SequenceGenerator(name = "SQ_PROFILE", sequenceName = "SQ_PROFILE", allocationSize = 1)

    @Column(name = "ID_PROFILE")
    private Long idUser;

    @Column(name = "NM_USER")
    private String nmUser;

    @Column(name = "PASS_USER")
    private String passUser;

    @Column(name = "PERMISSION")
    private String permission;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DT_REGISTER_PROFILE")
    private LocalDate dtRegister;
}
