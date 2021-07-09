package control;
import model.Catalogo;
import model.ElementoPatrimonial;

public class DefineElementoPatrimonialCommand implements Command {
    private ElementoPatrimonial y;
    private Catalogo x;
    
    public DefineElementoPatrimonialCommand (Catalogo x, ElementoPatrimonial y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public void execute() {
        x.añadirElemento(y);
    }
}

