package com.example.src.exemplar;

/**
 * Classe Revista.
 * 
 * @author Carlos da Costa.
 * @version 1.0
 */
public class Revista extends Exemplar {
    
    private final String TIPO_EXEMPLAR = "Revista";

    /**
     * Método construtor.
     * 
     * @param nomeExemplar
     * @param numeroCadastro
     */
    public Revista(String nomeExemplar, String autor, String numeroCadastro) {
        super(nomeExemplar, autor, numeroCadastro);
    }

    /**
     * Método abstrato.
     * 
     * @return tipo de Exemplar.
     */
    @Override
    public String getTipoExemplar() {
        return this.TIPO_EXEMPLAR;
    }

    /**
     * Converte Objeto para string.
     * 
     * @return representação string do Objeto.
     */
    @Override
    public String toString() {
        return "[" + "Tipo de exemplar: " + TIPO_EXEMPLAR + " | " + "Nome: " + getNomeExemplar()
                +  " | " + "Autor: " + getAutor() + " | " + "Número de cadastro: " + getNumeroCadastro() + "]";
    }

}
