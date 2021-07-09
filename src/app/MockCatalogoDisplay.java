package app;

import model.Catalogo;
import view.CatalogoDisplay;

public class MockCatalogoDisplay implements CatalogoDisplay {
    private Catalogo list;
    
    public void update() {
        display();
    }

    public MockCatalogoDisplay(Catalogo list) {
        this.list = list;
    }

    @Override
    public void display() {
        System.out.println(list);
    }
}