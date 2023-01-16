public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro = new Carro();

        carro.setCor("Laranja");
        carro.setModelo("Chevrolet Onix");
        carro.setCapacidadeTanque(60);

        System.out.println(carro.getModelo());
        System.out.println(carro.getCor());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(4.40));

        Carro carro2 = new Carro("Azul", "Fusca", 50);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(2.40));
    }
}
