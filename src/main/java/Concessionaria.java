public class Concessionaria {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        System.out.println("Carro básico: " + carro.preco());

        Veiculo carroComArCondicionado = new ArCondicionado(carro);
        System.out.println("Carro com ar-condicionado: " + carroComArCondicionado.preco());

        Veiculo carroComVidroEletricoEDirecaoEletrica = new DirecaoEletrica(new VidroEletrico(carro));
        System.out.println("Carro com vidro elétrico e direção elétrica: " + carroComVidroEletricoEDirecaoEletrica.preco());
    }
}