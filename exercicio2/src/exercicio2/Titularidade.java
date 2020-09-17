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
public enum Titularidade {
    PRIMEIRO(1000.0), ADICIONAL(500.00);

    private final Double limite;

    private Titularidade(Double limite) {
        this.limite = limite;
    }

    public Double getLimite() {
        return limite;

    }
}
