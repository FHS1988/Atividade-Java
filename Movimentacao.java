/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentobanco;

/**
 *
 * @author FS
 */
public class Movimentacao {
    private float saldo;
    private int saques;
    
    public Movimentacao(float saldo){
        this.saldo = saldo;
    }   
    public void depositar(float valorDeposito){
        saldo += valorDeposito;
    }
    public boolean sacar(float valorSaque){
         if(valorSaque < 0.0){
             return false;
         }
         this.saldo -= valorSaque;
         this.saques ++;
         return true;
     }
    public float getSaldo(){
         return this.saldo;
    }
}
