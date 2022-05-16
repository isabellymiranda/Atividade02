public class Novo extends Imovel{
    private double adicionalPreco;

    public double getAdicionalPreco() {
        return adicionalPreco;
    }

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
    }
    
    public void calcularImovel(){
        double imovel;
        imovel = getPreco()+getAdicionalPreco();
        System.out.println(imovel);
    }
}