/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciamentobanco;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FS
 */
/*chamado de opções da switch case na classe main para movimentação da conta*/
public class GerenciamentoBanco {
    private static void exibirMenu(){
        System.out.println("Digite a opcao desejada");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        System.out.println("3 - Exibir Saldo");
        System.out.println("4 - Sair");
        System.out.println("Opcao: ");
    }
    public static void main(String[] args){
        /*declaração da variavél scanner e random para ativação da importação da biblioteca*/
        String nome, sobrenome, cpf;
        var scanner = new Scanner(System.in);
        Random numero = new Random();
        int conta  = 1 + numero.nextInt(9999);
        var saldo = 0.0;
        var saques = 0;
        
        System.out.println("\tCADASTRANDO NOVO CLIENTE\n");
        System.out.println("Entre com seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Entre com seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe seu CPF: ");
        cpf = scanner.nextLine();
        
        System.out.println("Criando usuario: "+conta+" "+ nome +" "+ sobrenome);
        System.out.println("CPF: "+ cpf);
        /*Cliente minhaConta = new Cliente(nome,sobrenome,conta);*/
        
        exibirMenu();
        /*declaração da varial scanner para captura do teclado para concluir a etapa de escolha de opção*/
        var opcao = scanner.nextInt();
     
        /*declaração da switch case com os chamandos dos metodos das movimentações da conta da classe movitacao*/
        while(opcao != 4){
            switch(opcao){
                case 1 -> {
                    System.out.println("Digite o valor de deposito");
                    var valorDeposito = scanner.nextFloat();
                    if(valorDeposito < 0.0){
                        System.out.println("Valor invalido");
                    }
                    else{
                        saldo += valorDeposito;
                        System.out.println("Valor depositado: " + valorDeposito );
                        System.out.println("Saldo: " + saldo);
                    }break;
                }
                case 2 -> {
                    System.out.println("Digite o valor a sacar");
                    var valorSaque = scanner.nextFloat();
                    if(valorSaque < 0.0){
                        System.out.println("Valor invalido");
                    }
                    else{
                        saldo -= valorSaque;
                        saques++;
                        if(saldo == -2000){
                            System.out.println("Saldo Insuficiente. Faca uma deposito.");
                        }
                        else{
                            System.out.println("Valor Retirado: " + valorSaque );
                        System.out.println("Saldo: " + saldo);
                        }
                    }break;
                }
                case 3 -> {
                    System.out.println("\tSaldo");
                    System.out.println("Conta: " + conta);
                    System.out.println("Cliente: "+ nome+" "+ sobrenome);
                    System.out.println("Saldo: " + saldo);
                    System.out.println("Saques realizados hoje: " + saques);
                    break;
                }
                default -> {
                    
                }
                    
            }
            /*retorna as opções do menu das opções de movimentação da conta*/
            exibirMenu();
                    opcao = scanner.nextInt();
        }
        
    }
}
