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
public abstract class Cartao implements TransacaoCartao{
    private Bandeira bandeira;
    
    @Override
    public void opSaqueConta(Conta conta) {
        
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public Cartao(Bandeira bandeira) {
        this.bandeira = bandeira;
    }
    
    
}
