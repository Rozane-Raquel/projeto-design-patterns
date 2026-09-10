public class GolaPoloDecorator extends ProductDecorator {

    public GolaPoloDecorator(Product produto) {
        super(produto);
        this.setPrice(produto.getPrice() + 10);
    }

    @Override
    public String getNome() {
        return produto.getNome() + " + Gola Polo";
    }
      public String getColor() {
        return produto.getColor() + " + Gola Polo";
    }
      public String getSize() {
        return produto.getSize() + " + Gola Polo";
    }
}
