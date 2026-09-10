import java.util.ArrayList;

public class Inventario {

    private ArrayList<CamisaFactory> produtos = new ArrayList<>();

    public Inventario() {
        produtos.add(new CamisaEsportivaFactory());
        produtos.add(new CamisaSocialFactory());
    }

    public void showInventory() {
        int i = 1;
        for (CamisaFactory produto: produtos) {
            Product p = produto.criarCamisa();
            System.out.println(i + ". " + p.getNome());
            i++;
        }
    }

    public Product getProduct(int index) {
           if (index <= 0 || index > produtos.size()) {
            return null;
        }
        return produtos.get(index - 1).criarCamisa();
    
    }
}