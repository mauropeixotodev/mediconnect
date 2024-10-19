package br.com.mediconnect.core.port.out.doctor;

import br.com.mediconnect.core.domain.Doctor;

public interface CreateDoctorOutputPort {
    public Doctor create(Doctor doctor) throws Exception;
}
