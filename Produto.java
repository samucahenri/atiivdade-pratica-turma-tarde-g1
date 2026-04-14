package org.senai.exemplos;

public class Produto {
     String nome;
     double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularDesconto(double percentual) {
        double desconto = preco * percentual;
        return preco - desconto;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + " - Preço: " + preco);
    }
}