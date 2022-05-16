public class Velho extends Imovel {

    private double descontoImovel;

    public double getDescontoImovel() {
        return descontoImovel;
    }

    public void setDescontoImovel(double descontoImovel) {
        this.descontoImovel = descontoImovel;
    }

    public void calcularImovel(){
        double imovel;
        imovel = getPreco()-getDescontoImovel();
        System.out.println(imovel);
    }
    
    
}