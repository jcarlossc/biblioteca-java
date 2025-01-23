package com.example.src.exemplar;

/**
 * Classe Livro 
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Livro extends Exemplar {
    
    private final String TIPO_EXEMPLAR = "Livro";

    /**
     * Método construtor
     * 
     * @param nomeExemplar
     * @param numeroCadastro
     */
    public Livro(String nomeExemplar, String numeroCadastro) {
        super(nomeExemplar, numeroCadastro);
    }

    /**
     * Método abstrato
     * 
     * @return tipo de Exemplar
     */
    public String getTipoExemplar() {
        return this.TIPO_EXEMPLAR;
    }

    /**
     * Converte Objeto para string
     * 
     * @return representação string do Objeto
     */
    @Override
    public String toString() {
        return "Livro " + "[" + "Tipo de exemplar: " + TIPO_EXEMPLAR + " | " + "Nome: " + getNomeExemplar() + " | " +"Número do cadastro: "
                + getNumeroCadastro() + "]";
    }
    
}
