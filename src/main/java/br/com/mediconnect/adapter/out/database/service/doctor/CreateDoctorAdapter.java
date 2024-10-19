package br.com.mediconnect.adapter.out.database.service.doctor;

import br.com.mediconnect.adapter.out.database.mapper.DoctorEntityMapper;
import br.com.mediconnect.adapter.out.database.repository.DoctorEntityRepository;
import br.com.mediconnect.core.domain.Doctor;
import br.com.mediconnect.core.port.out.doctor.CreateDoctorOutputPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreateDoctorAdapter implements CreateDoctorOutputPort {

    private final DoctorEntityRepository doctorEntityRepository;

    private final DoctorEntityMapper doctorEntityMapper;

    @Override
    public Doctor create(Doctor doctor) throws Exception {
        return doctorEntityMapper.toDoctor(doctorEntityRepository.save(doctorEntityMapper.toDoctorEntity(doctor)));
    }
}
