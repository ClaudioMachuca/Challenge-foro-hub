package api.hub.domain.topico;

import java.time.LocalDateTime;

public record RespuestaTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        Status status,
        Long usuario_Id,
        String curso,
        LocalDateTime fecha) {
    public RespuestaTopicoDTO(Topico topicoId) {
        this(
                topicoId.getId(),
                topicoId.getTitulo(),
                topicoId.getMensaje(),
                topicoId.getStatus(),
                topicoId.getAutor().getId(),
                topicoId.getCurso(),
                topicoId.getFecha());
    }
}