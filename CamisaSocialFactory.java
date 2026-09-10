public class CamisaSocialFactory implements CamisaFactory {
      @Override
    public Product criarCamisa() {
        return new CamisaSocial("M", "Branca", 120, "Calvin Klein", "Algodão");
    }
}

