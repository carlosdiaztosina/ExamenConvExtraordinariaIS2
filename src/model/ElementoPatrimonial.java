package model;

public class ElementoPatrimonial {
    private int localizacion;
    private String autor;
    private String nombre;
    private int año;
    private String metodoFabricacion;
    private String material;
    private String estadoConservacion;
    private Galeria galeriaFotografia;

    public ElementoPatrimonial(int localizacion, String autor, String nombre, int año, String metodoFabricacion, String material, String estadoConservacion, Galeria galeriaFotografia) {
    this.localizacion = localizacion;
    this.autor = autor;
    this.nombre = nombre; 
    this.año = año;
    this.metodoFabricacion = metodoFabricacion;
    this.material = material;
    this.estadoConservacion = estadoConservacion;
    this.galeriaFotografia = galeriaFotografia;
    }
    
    public int getLocalizacion() {
        return localizacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public String getMetodoFabricacion() {
        return metodoFabricacion;
    }

    public String getMaterial() {
        return material;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public Galeria getGaleriaFotografia() {
        return galeriaFotografia;
    }
}