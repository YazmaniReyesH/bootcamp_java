package yazmanireyesh.bootcampjava.gestiondeusuarios.controllers;

import org.springframework.web.bind.annotation.*;
import yazmanireyesh.bootcampjava.gestiondeusuarios.models.Usuario;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    List<Usuario> usuarios = new ArrayList<>();
    //static List<Usuario> usuarios = List.of(new Usuario(1, "Lucas", "Moy", "12345678", "lucasmoy.atl.academy"));
    @GetMapping("/api/usuarios")
    public List<Usuario> listarUsuarios(){
        //List<Usuario> usuarios = new ArrayList<>();
        //Usuario user = new Usuario(1, "Lucas", "Moy", "12345678", "lucasmoy.atl.academy");
        //usuarios.add(user);
        return usuarios;

        /*
        return "[\n" +
                " {\n" +
                "  \"id\": 1,\n" +
                "  \"nombre\": \"Lucas\",\n" +
                "  \"apellido\": \"Moy\",\n" +
                "  \"telefono\": \"12345678\",\n" +
                "  \"email\": \"locasmoy.dev@atl.academy\"\n" +
                " },\n" +
                " {\n" +
                "  \"id\": 2,\n" +
                "  \"nombre\": \"Yazmani\",\n" +
                "  \"apellido\": \"Reyes\",\n" +
                "  \"telefono\": \"12345678\",\n" +
                "  \"email\": \"yazmani.reyes@atl.academy\"\n" +
                " }\n" +
                "]";*/
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuarios(@PathVariable String id){

        /*
        Usuario usuarioEncontrado = usuarios.stream().filter(user -> user.getId().equals(id)).findFirst().get();
        usuarios.remove(usuarioEncontrado);
        */
        for (Usuario user : usuarios){
            if (id.equals(user.getId().toString())){
                usuarios.remove(user);
            }
        }
    }

    @PostMapping("/api/usuarios")
    public void agregarUsuarios(@RequestBody Usuario user){
        usuarios.add(user);
    }
    /*
    @GetMapping("/prueba")
    public String prueba1(){
        return "Prueba de request GET";
    }

    @PostMapping ("/prueba")
    public String prueba2(){
        return "Prueba de request POST";
    }

    @PutMapping("/prueba")
    public String prueba3(){
        return "Prueba de request PUT";
    }

    @PatchMapping("/prueba")
    public String prueba5(){
        return "Prueba de request PATCH";
    }*/

}
