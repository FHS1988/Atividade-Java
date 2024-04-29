/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentobanco;

/**
 *
 * @author FS
 */
public class Cliente {
    private String nome, sobrenome, cpf;
    private int conta;
    /*Scanner scanner = new Scanner(System.in);*/
    
    public Cliente(String nome, String sobrenome, String cpf, int conta){
        
        this.nome =  nome;
        this.sobrenome = sobrenome;
        this.conta =  conta;
        this.cpf = cpf;
    }
    public String getNome(){
         return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome(){
         return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getConta(){
         return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}