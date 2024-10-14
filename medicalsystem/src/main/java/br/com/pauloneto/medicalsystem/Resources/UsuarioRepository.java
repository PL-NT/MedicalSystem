package br.com.pauloneto.medicalsystem.Resources;

import br.com.pauloneto.medicalsystem.Domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
