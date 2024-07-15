package api.hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegistroTopicoDTO (
        @NotBlank(message = "Título es obligatorio")
        String titulo,
        @NotBlank(message = "Mensaje es obligatorio")
        String mensaje,
        @NotBlank(message = "Curso es obligatorio")
        String curso,
        @NotNull(message = "Author_id es obligatorio")
        Long autor_id
) {

    public RegistroTopicoDTO(String titulo, String mensaje, String curso, Long autor_id){
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.curso = curso;
        this.autor_id = autor_id;
    }
}