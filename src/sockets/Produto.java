/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

/**
 *
 * @author Vítor
 */
public class Produto {
    
    private String nome;
    private double valorAtual;

    public Produto(String nome, double valorAtual) {
        this.nome = nome;
        this.valorAtual = valorAtual;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }
    
    
    
}
