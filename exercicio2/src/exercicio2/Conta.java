/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author guilherme
 */
public class Conta {

    private double saldo;
    private Titular titular;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Conta() {
    }
    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

     public void compensar(double valor) {
         if(valor <= titular.tipoTitularidade()){
             this.saldo = this.saldo - valor;
         }else{
             System.out.println("Limite insuficiente para saque");
         }
        
    }

}
