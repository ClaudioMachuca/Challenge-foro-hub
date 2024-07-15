package api.hub.domain.usuario;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

public record ListarUsuariosDTO (
        Long id,
        String nombre,
        String email
){
    public ListarUsuariosDTO(Usuario usuario){

        this(usuario.getId(),usuario.getNombre(),usuario.getEmail());
    }
}