package br.com.pauloneto.medicalsystem.ConsultaResource;

import br.com.pauloneto.medicalsystem.ConsultaDomain.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
