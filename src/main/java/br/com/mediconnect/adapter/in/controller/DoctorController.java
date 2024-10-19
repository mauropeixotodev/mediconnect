package br.com.mediconnect.adapter.in.controller;

import br.com.mediconnect.core.domain.Doctor;
import br.com.mediconnect.core.port.in.doctor.CreateDoctorInputPort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController()
@RequestMapping("/doctor")
@AllArgsConstructor
public class DoctorController {

    private final CreateDoctorInputPort createDoctorInputPort;

    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor,  UriComponentsBuilder uriBuilder) throws Exception {
        URI uri = uriBuilder.path("/doctor/{id}").buildAndExpand(doctor.getId()).toUri();
        return ResponseEntity.created(uri).body(doctor);
    }

}
