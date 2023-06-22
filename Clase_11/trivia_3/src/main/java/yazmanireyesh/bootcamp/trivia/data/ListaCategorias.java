package yazmanireyesh.bootcamp.trivia.data;

import yazmanireyesh.bootcamp.trivia.entities.Categoria;

import java.util.ArrayList;
import java.util.List;

public class ListaCategorias {

    public static List<Categoria> getCategoriesList() {

        Categoria categoriaCultura = new Categoria();
        categoriaCultura.setCategory("Cultura");
        categoriaCultura.setDescripcion("Preguntas relacionadas con arte, literatura, música y otras expresiones culturales.");

        Categoria categoriaDeportes = new Categoria();
        categoriaDeportes.setCategory("Deportes");
        categoriaDeportes.setDescripcion("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria categoriaArte = new Categoria();
        categoriaArte.setCategory("Arte");
        categoriaArte.setDescripcion("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria categoriaCine = new Categoria();
        categoriaCine.setCategory("Cine");
        categoriaCine.setDescripcion("Preguntas relacionadas con películas, directores, actores y otros aspectos del cine.");

        Categoria categoriaHistoria = new Categoria();
        categoriaHistoria.setCategory("Historia");
        categoriaHistoria.setDescripcion("Preguntas relacionadas con eventos históricos, personajes y períodos importantes.");

        Categoria categoriaCiencia = new Categoria();
        categoriaCiencia.setCategory("Ciencia");
        categoriaCiencia.setDescripcion("Preguntas relacionadas con diferentes ramas de la ciencia, descubrimientos y avances científicos.");

        List<Categoria> listaCategorias = new ArrayList<>();
        listaCategorias.add(categoriaCultura);
        listaCategorias.add(categoriaDeportes);
        listaCategorias.add(categoriaArte);
        listaCategorias.add(categoriaCine);
        listaCategorias.add(categoriaHistoria);
        listaCategorias.add(categoriaCiencia);

        return listaCategorias;
    }
}
