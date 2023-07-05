package yazmanireyesh.bootcampjava.gestiondeusuarios.models;

import lombok.*;

@Data @AllArgsConstructor @NoArgsConstructor
public class Usuario {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}
