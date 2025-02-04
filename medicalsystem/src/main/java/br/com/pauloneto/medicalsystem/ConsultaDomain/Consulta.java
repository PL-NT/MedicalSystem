package br.com.pauloneto.medicalsystem.ConsultaDomain;

import br.com.pauloneto.medicalsystem.Domain.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONSULTAS")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONSULTA")
    private Long idConsulta;
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column (name = "DATA_CONSULTA")
    private String dataConsulta;
    @Column(name = "PROFISSIONAL")
    private String profissional;
    @Column(name = "ESPECIALIDADE")
    private String especialidade;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    public Consulta(){

    }
}
