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
public class Titular {
    private String cpf;
    private String nome;
    private Titularidade titular;

    public Titular() {
    }


    public Titularidade getTitular() {
        return titular;
    }

    public void setTitular(Titularidade titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Titular(String cpf, String nome, Titularidade titular) {
        this.cpf = cpf;
        this.nome = nome;
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }
    public Double tipoTitularidade(){
        return titular.getLimite();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
