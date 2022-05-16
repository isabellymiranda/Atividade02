public class Teste {
    
    public static void main(String[] args) {
        
        Novo ni = new Novo();
        ni.setEndereco("Rua A 134");
        ni.setPreco(125560.50);
        ni.setAdicionalPreco(10000);

        System.out.println(ni.getEndereco());
        ni.calcularImovel();

        Velho vi= new Velho();
        vi.setEndereco("Rua Z 90");
        vi.setPreco(130000.00);
        vi.setDescontoImovel(15000);

        System.out.println(vi.getEndereco());
        vi.calcularImovel();
    }
}