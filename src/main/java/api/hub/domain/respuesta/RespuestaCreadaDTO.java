package api.hub.domain.respuesta;

import java.time.LocalDateTime;

public record RespuestaCreadaDTO(
        Long id,
        String solucion,
        Long usuario_Id,
        Long topico_Id,
        LocalDateTime fechaCreacion
) {
    public RespuestaCreadaDTO(Respuesta rVerified) {
        this(rVerified.getId(),rVerified.getSolucion(),rVerified.getAutor().getId(),rVerified.getTopico().getId(),rVerified.getFechaCreacion());
    }
}