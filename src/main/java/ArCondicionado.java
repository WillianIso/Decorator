class ArCondicionado extends Acessorio {
    public ArCondicionado(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public double preco() {
        return veiculo.preco() + 1500.0;
    }
}