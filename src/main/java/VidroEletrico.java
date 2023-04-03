class VidroEletrico extends Acessorio {
    public VidroEletrico(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public double preco() {
        return veiculo.preco() + 800.0;
    }
}