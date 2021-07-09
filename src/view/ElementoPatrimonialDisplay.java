package view;
import model.Catalogo;

public interface ElementoPatrimonialDisplay extends Catalogo.Observer{
    void display();
}
