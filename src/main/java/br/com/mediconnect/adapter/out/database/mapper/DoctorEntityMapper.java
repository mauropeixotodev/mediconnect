package br.com.mediconnect.adapter.out.database.mapper;

import br.com.mediconnect.adapter.out.database.entity.DoctorEntity;
import br.com.mediconnect.core.domain.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", implementationName = "DoctorEntityMapperImpl")
public interface DoctorEntityMapper {

    Doctor toDoctor(DoctorEntity doctorEntity);

    DoctorEntity toDoctorEntity(Doctor doctor);

}
