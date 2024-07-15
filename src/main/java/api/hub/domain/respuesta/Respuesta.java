package api.hub.domain.respuesta;

import api.hub.domain.topico.Topico;
import api.hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity(name="Respuesta")
@Table(name = "respuestas")
@Getter
@Setter
@NoArgsConstructor
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaCreacion;
    private String solucion;
    @OneToOne
    @JoinColumn(name="autor", referencedColumnName="id")
    private Usuario autor;
    @OneToOne
    @JoinColumn(name="topico", referencedColumnName="id")
    private Topico topico;
    private boolean activo;

    public Respuesta(Long id, String solucion, Usuario usuario, Topico topico, LocalDateTime fechaCreacion) {
        this.id=id;
        this.solucion=solucion;
        this.autor=usuario;
        this.topico=topico;
        this.fechaCreacion=LocalDateTime.now();
    }

    public void respuestaActualizada(RespuestaActualizadaDTO respuestaActualizadaDTO) {
        if (respuestaActualizadaDTO.solucion() != null){
            this.solucion=respuestaActualizadaDTO.solucion();
        }
    }
    public void diactivateResponse(){

        this.activo=false;
    }
}