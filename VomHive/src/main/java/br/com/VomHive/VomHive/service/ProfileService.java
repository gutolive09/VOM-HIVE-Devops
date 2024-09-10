package br.com.VomHive.VomHive.service;

import br.com.VomHive.VomHive.dto.request.ProfileRequest;
import br.com.VomHive.VomHive.dto.response.ProfileResponse;
import br.com.VomHive.VomHive.entity.Profile;
import br.com.VomHive.VomHive.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ProfileService implements ServiceDTO<Profile, ProfileRequest, ProfileResponse>{

    @Autowired
    private ProfileRepository repo;

    //    Long idUser,
//
//    String nmUser,
//
//    String passUser,
//
//    String permission,
//
//    String status,
//
//    LocalDate dtRegister

    @Override
    public Profile toEntity(ProfileRequest r) {

        return Profile.builder()
                .idUser(r.idUser())
                .nmUser(r.nmUser())
                .passUser(r.passUser())
                .permission(r.permission())
                .status(r.status())
                .dtRegister(r.dtRegister())
                .build();
    }

    @Override
    public ProfileResponse toResponse(Profile e) {

        return ProfileResponse.builder()
                .idUser(e.getIdUser())
                .nmUser(e.getNmUser())
                .passUser(e.getPassUser())
                .permission(e.getPermission())
                .status(e.getStatus())
                .dtRegister(e.getDtRegister())
                .build();
    }

    @Override
    public Collection<Profile> findAll(Example<Profile> example) {
        return repo.findAll( example );
    }

    @Override
    public Profile findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Profile save(Profile e) {
        return repo.save( e );
    }
}
