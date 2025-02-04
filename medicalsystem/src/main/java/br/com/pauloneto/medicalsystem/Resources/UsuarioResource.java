package br.com.pauloneto.medicalsystem.Resources;

import br.com.pauloneto.medicalsystem.Domain.Usuario;
import br.com.pauloneto.medicalsystem.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = usuarioService.cadastrarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNovo);
    }

    @GetMapping (value = "{/id}")
    public ResponseEntity<Usuario> buscarCliente(@PathVariable Long id){
        Usuario usuario = usuarioService.buscarUsuario(id);
        return ResponseEntity.ok().body(usuario);

    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarClientes(){
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return ResponseEntity.ok().body(usuarios);

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> atualizarCliente(@PathVariable Long id, @RequestBody Usuario usuario){
        Usuario upCliente = usuarioService.atualizarUsuario(id, usuario);
        return ResponseEntity.ok().body(upCliente);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id){
        usuarioService.deletarUsuario(id);
        return ResponseEntity.noContent().build();

    }

}
