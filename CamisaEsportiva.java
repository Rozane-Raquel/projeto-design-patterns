public class CamisaEsportiva extends Shirt{
    private String dryfit;
    public CamisaEsportiva (String size, String color, double price, String marca, String dryfit){
            super (size, color, price, marca);
           this.dryfit=dryfit;
    }

         @Override
    public String getNome() {
        return "Camisa Esportiva (" + dryfit + ") " + getMarca();
    }

    @Override
    public CamisaEsportiva clone() {
    return new CamisaEsportiva(getSize(), getColor(), getPrice(), getMarca(), dryfit);
}

    
}
