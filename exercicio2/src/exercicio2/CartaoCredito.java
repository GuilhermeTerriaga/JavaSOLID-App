/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class CartaoCredito extends Cartao{
    private double fatura;

    public CartaoCredito(Bandeira bandeira) {
        super(bandeira);
    }

 
    
    public double getFatura() {
        return fatura;
    }

    public void setFatura(double fatura) {
        this.fatura = fatura;
    }
    
    public void opSaqueConta(Conta conta, double valor) {
       if(valor > 0.0){
        this.fatura = this.fatura + valor;
           System.out.println("Compensar fatura?\n S / N");
           Scanner keyboard = new Scanner(System.in);
           String resposta = keyboard.nextLine();
           if(resposta.equals(resposta)){
               conta.compensar(this.fatura);
           }
       }else{
           System.out.println("Valor menor ou igual a zero");
       
        
        }
    }
}
