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
public class Bandeira {
    private String nome;
    private int codigo;

    public Bandeira(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    Bandeira() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
