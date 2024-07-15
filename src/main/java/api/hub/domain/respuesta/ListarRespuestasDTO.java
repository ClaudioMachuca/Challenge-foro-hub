package api.hub.domain.respuesta;

import java.time.LocalDateTime;

public record ListarRespuestasDTO(Long id,
                                String solucion,
                                Long usuario_Id,
                                Long topico_Id,
                                LocalDateTime fechaCreacion) {
    public ListarRespuestasDTO(Respuesta respuesta){
        this(respuesta.getId(),
                respuesta.getSolucion(),
                respuesta.getAutor().getId(),
                respuesta.getTopico().getId(),
                respuesta.getFechaCreacion());
    }
}
