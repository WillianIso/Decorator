class DirecaoEletrica extends Acessorio {
    public DirecaoEletrica(Veiculo veiculo) {
        super(veiculo);
    }

    @Override
    public double preco() {
        return veiculo.preco() + 2000.0;
    }
}