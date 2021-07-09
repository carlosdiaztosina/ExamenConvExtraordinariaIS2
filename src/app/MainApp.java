package app;

import control.*;
import model.*;
import view.*;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {
        new MainApp().execute();
    }

    private void execute() {
        Catalogo bustoCatalogo = new Catalogo();
        List<Catalogo> catalogos = new ArrayList<Catalogo>();  
        List<ElementoPatrimonial> elementos = new ArrayList<>();
        Imagen bustoImangen1 = new Imagen ("bustoImg");
        Imagen bustoImangen2 = new Imagen ("EstatuasImg");
        Imagen bustoImangen3 = new Imagen ("IglesiasImg");
        Galeria galeria = new Galeria();
        galeria.añadirImagen(bustoImangen1);
        
        ElementoPatrimonial busto1 = new ElementoPatrimonial(1111, "David", "ReyFelipeII", 1990, "Rupestre", "Acuarelas", "Muy buen estado", galeria);
        elementos.add(busto1);
        
        catalogos.add(bustoCatalogo);
        
        bustoCatalogo.añadirElemento(busto1);
        
        CatalogoDisplay displayCatalogo = new MockCatalogoDisplay(bustoCatalogo);
        ElementoPatrimonialDisplay displayElementoPatrimonial = new MockElementoPatrimonialDisplay(bustoCatalogo);
        
        bustoCatalogo.registerObserver((Catalogo.Observer) displayCatalogo);
        
        bustoCatalogo.unregisterObserver((Catalogo.Observer) displayCatalogo);
        bustoCatalogo.registerObserver(displayElementoPatrimonial);
    }
    
}
