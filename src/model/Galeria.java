package model;
import java.util.*;

public class Galeria {
    private List<Imagen> imagenes;

    public Galeria() {
        imagenes = new ArrayList<Imagen>();
    }

    public void añadirImagen(Imagen x) {
        imagenes.add(x);
    }

    public void eliminarImagen(Imagen x) {
        imagenes.remove(x);
    }
}