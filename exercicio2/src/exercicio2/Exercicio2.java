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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular();
        Conta conta = new Conta();
        Bandeira bandeira = new Bandeira();
        
        
        titular.setCpf("123");
        titular.setNome("guilherme");
        titular.setTitular(Titularidade.PRIMEIRO);
        
        conta.setSaldo(5000.00);
        conta.setTitular(titular);
        
        bandeira.setCodigo(1);
        bandeira.setNome("Visa Sei La");
        
        CartaoCredito cartao = new CartaoCredito(bandeira);
        
       cartao.opSaqueConta(conta, 400.00);
        System.out.println(conta.getSaldo());
     
        
        
        
    }
    
}
