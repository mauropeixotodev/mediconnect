package br.com.mediconnect.core.port.in.doctor;

import br.com.mediconnect.core.domain.Doctor;

public interface CreateDoctorInputPort {
    public Doctor create(Doctor doctor) throws Exception;
}
