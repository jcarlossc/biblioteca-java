package com.example.src.exemplar;

/**
 * Classe Revista
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Revista extends Exemplar {
    
    private final String TIPO_EXEMPLAR = "Revista";

    /**
     * Método construtor
     * 
     * @param nomeExemplar
     * @param numeroCadastro
     */
    public Revista(String nomeExemplar, String numeroCadastro) {
        super(nomeExemplar, numeroCadastro);
    }

    /**
     * Método abstrato
     * 
     * @return tipo de Exemplar
     */
    @Override
    public String getTipoExemplar() {
        return this.TIPO_EXEMPLAR;
    }

    @Override
    public String toString() {
        return "Revista " + "[" + "Tipo de exemplar: " + TIPO_EXEMPLAR + " | " + "Nome: " + getNomeExemplar()
                + " | " + "Número do cadastro: " + getNumeroCadastro() + "]";
    }

    
}
