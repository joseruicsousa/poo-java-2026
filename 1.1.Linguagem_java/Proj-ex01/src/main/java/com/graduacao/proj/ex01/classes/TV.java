/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.graduacao.proj.ex01.classes;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class TV {
    
    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    public TV() {
        this.marca = "";
        this.tamanho = 0.0;
        this.resolucao = "";
        this.preco = 0.0;
    }

    public TV(String marca, double tamanho, String resolucao, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("marca:" + this.getMarca());
        System.out.println("tamanho:"+ this.getTamanho());
        System.out.println("resolucao:"+ this.getResolucao());
        System.out.println("preco:"+ this.getPreco());
      
    }

    @Override
    public String toString() {
        return "marca:" + this.getMarca() + "\n"+
                    "tamanho:"+ this.getTamanho()+ "\n"+
                    "resolucao:"+ this.getResolucao()+ "\n"+
                    "preco:"+ this.getPreco();
        
       
    }
    
   
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Preenhendo TV\n");
        System.out.print("Marca:");
        this.setMarca(leitor.next());
        
        System.out.print("tamanho:");
        this.setTamanho(leitor.nextDouble());
    }
     
    public void copiar(TV outra){
        this.marca = outra.getMarca();
        this.setPreco(outra.getPreco());
        this.tamanho = outra.getTamanho();
        this.resolucao = outra.getResolucao();
    }
    


    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @return the tamanho
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the resolucao
     */
    public String getResolucao() {
        return resolucao;
    }

    /**
     * @param resolucao the resolucao to set
     */
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
