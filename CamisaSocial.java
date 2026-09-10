public class CamisaSocial extends Shirt{
    private String tecido;

    public CamisaSocial (String size, String color, double price, String marca, String tecido){
          super(size, color, price, marca);
          this.tecido = tecido;
    }
     @Override
    public String getNome() {
        return "Camisa Social (" + tecido + ") " + getMarca();
    }

    @Override
    public CamisaSocial clone() {
    return new CamisaSocial(getSize(), getColor(), getPrice(), getMarca(), tecido);
}

    }



