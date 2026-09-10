public class CamisaEsportivaFactory implements CamisaFactory{

    public Product criarCamisa(){
        return new CamisaEsportiva("m", "branco", 50, "nike", "Dry fit");
    }
}
