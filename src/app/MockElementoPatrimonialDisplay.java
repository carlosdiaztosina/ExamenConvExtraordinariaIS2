package app;

import model.Catalogo;
import model.ElementoPatrimonial;

import view.ElementoPatrimonialDisplay;

public class MockElementoPatrimonialDisplay implements ElementoPatrimonialDisplay {
    private Catalogo list;

    public MockElementoPatrimonialDisplay(Catalogo list) {
        this.list = list;
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("ElementoPatrimonial actual: " + list.getCurrent());
    }
}