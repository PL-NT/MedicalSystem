package br.com.pauloneto.medicalsystem.Usuario.Resources;

import br.com.pauloneto.medicalsystem.Usuario.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
