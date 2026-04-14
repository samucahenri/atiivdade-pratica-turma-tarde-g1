package org.senai.exemplos;


public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV", 1500);
        p1.exibirInfo();

        ProdutoEletronico p2 = new ProdutoEletronico("Xbox", 2000, 12);
        p2.exibirGarantia();
    }
}

