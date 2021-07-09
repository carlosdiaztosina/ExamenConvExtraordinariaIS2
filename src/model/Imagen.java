package model;

public class Imagen {
    private String nombre;
    private static Imagen instance;

    public String getNombre() {
        return nombre;
    }

    public Imagen(String nombre) {
        this.nombre = nombre;
    }

    public static Imagen getInstance(String nombre) {
        if(instance == null || !instance.equals(new Imagen(nombre))) instance = new Imagen(nombre);
        return instance;
    }

}