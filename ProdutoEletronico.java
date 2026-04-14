package org.senai.exemplos;

public class ProdutoEletronico extends Produto {
    int garantiaMeses;

    public ProdutoEletronico(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public double calcularDesconto(double percentual) {
        return super.calcularDesconto(percentual) - 10;
    }

    public void exibirGarantia() {
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}