package model;
import java.util.*;

public class Catalogo {
    private List<ElementoPatrimonial> catalogo;
    private List<Observer> observerList = new ArrayList<>();
    private int pos;
    
    public Catalogo(){
        this.catalogo= new ArrayList<>();
        this.pos = 0;
    }
    
    public Catalogo( List<ElementoPatrimonial> catalogo){
        this.catalogo = catalogo;
        this.pos=0;
    }
    
    public boolean añadirElemento(ElementoPatrimonial e){
        return this.catalogo.add(e);
    }
    
    public boolean eliminarElemento(ElementoPatrimonial e){
        ElementoPatrimonial temporal = this.catalogo.remove(this.catalogo.indexOf(e));
        if(temporal != null) return true; 
        return false;
    }
    public void DefineElementoPatrimonial(int localizacion, String autor, String nombre, int año, String metodoFabricacion, String material, String estadoConservacion, Galeria galeriaFotografia){
        ElementoPatrimonial x = new ElementoPatrimonial(localizacion, autor, nombre, año, metodoFabricacion,material,estadoConservacion,galeriaFotografia);
        notifyObservers();
    }       
    public void registerObserver(Observer obs){
        this.observerList.add(obs);
    }
    
    public void unregisterObserver(Observer obs){
        this.observerList.remove(this.observerList.indexOf(obs));
    }
    
    public void notifyObservers() {
        for (Observer obs: observerList) {
            obs.update();
        }
    }

    public ElementoPatrimonial getCurrent() {
        return catalogo.get(pos);
    }
    
    public interface Observer{
        void update();
    }
    
    
    @Override
    public String toString(){
        String s = "";
        for(ElementoPatrimonial e : catalogo){
            s += e + "\n";
        }
        return s;
    }
}

