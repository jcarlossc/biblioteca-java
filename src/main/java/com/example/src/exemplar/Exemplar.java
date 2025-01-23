package com.example.src.exemplar;

/**
 * Classe Exemplar
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public abstract class Exemplar {

    private String nomeExemplar;
    private String numeroCadastro;

    /**
     * Método construtor
     * 
     * @param nomeExemplar
     * @param numeroCadastro
     */
    public Exemplar(String nomeExemplar, String numeroCadastro) {
        this.nomeExemplar = nomeExemplar;
        this.numeroCadastro = numeroCadastro;
    }

    /**
     * Método abstrato
     * 
     * @return tipo de Exemplar
     */
    public abstract String getTipoExemplar();

    /**
     * @return nome do Exemplar
     */
    public String getNomeExemplar() {
        return nomeExemplar;
    }

    /**
     * @return número do cadastro
     */
    public String getNumeroCadastro() {
        return numeroCadastro;
    }

    /**
     * Gera hashCode do Exemplar
     * 
     * @return hashCode do Exemplar
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeExemplar == null) ? 0 : nomeExemplar.hashCode());
        result = prime * result + ((numeroCadastro == null) ? 0 : numeroCadastro.hashCode());
        return result;
    }

    /**
     * Método que compara Objetos
     * 
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Exemplar other = (Exemplar) obj;
        if (nomeExemplar == null) {
            if (other.nomeExemplar != null)
                return false;
        } else if (!nomeExemplar.equals(other.nomeExemplar))
            return false;
        if (numeroCadastro == null) {
            if (other.numeroCadastro != null)
                return false;
        } else if (!numeroCadastro.equals(other.numeroCadastro))
            return false;
        return true;
    }

    /**
     * Converte Objeto para string
     * 
     * @return representação string do Objeto
     */
    @Override
    public String toString() {
        return "Exemplar" + "[" + " Nome: " + nomeExemplar + " | " + "Numero de cadastro" + numeroCadastro + "]";
    }
   
}
