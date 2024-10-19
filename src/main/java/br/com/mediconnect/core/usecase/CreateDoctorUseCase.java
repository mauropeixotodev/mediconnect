package br.com.mediconnect.core.usecase;

import br.com.mediconnect.core.domain.Doctor;
import br.com.mediconnect.core.port.in.doctor.CreateDoctorInputPort;
import br.com.mediconnect.core.port.out.doctor.CreateDoctorOutputPort;

public class CreateDoctorUseCase implements CreateDoctorInputPort{

    private final CreateDoctorOutputPort createDoctorOutputPort;

    public CreateDoctorUseCase(CreateDoctorOutputPort createDoctorOutputPort) {
        this.createDoctorOutputPort = createDoctorOutputPort;
    }

    @Override
    public Doctor create(Doctor doctor) throws Exception {
        return createDoctorOutputPort.create(doctor);
    }
}
