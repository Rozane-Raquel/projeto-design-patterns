public class EstampaDecorator extends ProductDecorator {

    public EstampaDecorator(Product produto) {
        super(produto);
        this.setPrice(produto.getPrice() + 15);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Estampa";
    }
         public String getColor() {
        return produto.getColor() + " + Gola Polo";
    }
      public String getSize() {
        return produto.getSize() + " + Gola Polo";
    }
}
