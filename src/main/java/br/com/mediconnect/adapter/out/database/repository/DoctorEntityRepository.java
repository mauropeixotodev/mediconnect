package br.com.mediconnect.adapter.out.database.repository;

import br.com.mediconnect.adapter.out.database.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, String> {
}
