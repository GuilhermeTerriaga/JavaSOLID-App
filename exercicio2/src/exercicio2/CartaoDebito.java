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
public class CartaoDebito extends Cartao{

    public CartaoDebito(Bandeira bandeira) {
        super(bandeira);
    }
    
    
    public void opSaqueConta(Conta conta, double valor ) {
       if(valor>0){
          conta.compensar(valor);
       }else{
           System.out.println("Valor menor ou igual a zero");
       }
    }
}
