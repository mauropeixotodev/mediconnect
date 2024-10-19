package br.com.mediconnect.infra.bean;

import br.com.mediconnect.adapter.out.database.service.doctor.CreateDoctorAdapter;
import br.com.mediconnect.core.port.in.doctor.CreateDoctorInputPort;
import br.com.mediconnect.core.port.out.doctor.CreateDoctorOutputPort;
import br.com.mediconnect.core.usecase.CreateDoctorUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DoctorConfig {

    @Bean
    public CreateDoctorInputPort CreateDoctorInputPort(CreateDoctorOutputPort createDoctorOutputPort){
           return new CreateDoctorUseCase(createDoctorOutputPort);
    }

}
