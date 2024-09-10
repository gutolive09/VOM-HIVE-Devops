package br.com.VomHive.VomHive.resource;

import br.com.VomHive.VomHive.dto.request.ProfileRequest;
import br.com.VomHive.VomHive.dto.response.ProfileResponse;
import br.com.VomHive.VomHive.entity.Profile;
import br.com.VomHive.VomHive.service.ProfileService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Objects;

@RestController
@RequestMapping(value = "/profile")
public class ProfileResource implements ResourceDTO<ProfileRequest, ProfileResponse>{

    @Autowired
    private ProfileService service;

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

    @GetMapping
    public ResponseEntity<Collection<ProfileResponse>> findAll(

            @RequestParam(name = "idUser", required = false) Long idUser,
            @RequestParam(name = "nmUser", required = false) String nmUser,
            @RequestParam(name = "passUser", required = false) String passUser,
            @RequestParam(name = "permission", required = false) String permission,
            @RequestParam(name = "status", required = false) String status,
            @RequestParam(name = "dtRegister", required = false) LocalDate dtRegister
    ) {
        var profileExample = Profile.builder()
                .idUser(idUser)
                .nmUser(nmUser)
                .passUser(passUser)
                .permission(permission)
                .status(status)
                .dtRegister(dtRegister)
                .build();

        ExampleMatcher matcher = ExampleMatcher
                .matchingAll()
                .withIgnoreCase()
                .withIgnoreNullValues();

        Example<Profile> example = Example.of(profileExample, matcher);
        Collection<Profile> all = service.findAll(example);
        if (Objects.isNull(all) || all.isEmpty()) return ResponseEntity.notFound().build();
        var response = all.stream().map(service::toResponse).toList();
        return ResponseEntity.ok(response);

    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<ProfileResponse> findById(@PathVariable Long id) {
        var entity = service.findById(id);
        if (Objects.isNull(entity)) return ResponseEntity.notFound().build();
        var response = service.toResponse(entity);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    @Transactional
    @Override
    public ResponseEntity<ProfileResponse> save(@RequestBody @Valid ProfileRequest c) {
        var entity = service.toEntity(c);

        entity = service.save(entity);

        var response = service.toResponse(entity);

        var uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(entity.getIdUser())
                .toUri();

        return ResponseEntity.created(uri).body(response);
    }
}
