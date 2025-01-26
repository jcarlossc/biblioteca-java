package com.example.src.usuario;

/**
 * Classe Usuário.
 * 
 * @author Carlos da Costa.
 * @version 1.0
 */
public abstract class Usuario {
    
    private String nomeUsuario;
    private String cpfUsuario;

    /**
     * Método construtor.
     * 
     * @param nomeUsuario
     * @param cpfUsuario
     */
    public Usuario(String nomeUsuario, String cpfUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
    }

    /**
     * @return tipo de usuário.
     */
    public abstract String getTipoUsuario();

    /**
     * 
     * @return nome do usuário.
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * 
     * @return cpf do usuário.
     */
    public String getCpfUsuario() {
        return cpfUsuario;
    }

    /**
     * Gera hashCode do usuário.
     * 
     * @return hashCode do Usuário.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nomeUsuario == null) ? 0 : nomeUsuario.hashCode());
        result = prime * result + ((cpfUsuario == null) ? 0 : cpfUsuario.hashCode());
        return result;
    }

    /**
     * Método que compara Objetos.
     * 
     * @return boolean.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nomeUsuario == null) {
            if (other.nomeUsuario != null)
                return false;
        } else if (!nomeUsuario.equals(other.nomeUsuario))
            return false;
        if (cpfUsuario == null) {
            if (other.cpfUsuario != null)
                return false;
        } else if (!cpfUsuario.equals(other.cpfUsuario))
            return false;
        return true;
    }

    /**
     * Converte Objeto para string.
     * 
     * @return representação string do Objeto.
     */
    @Override
    public String toString() {
        return "Usuario " + "[" + "Nome: " + nomeUsuario + " | " + "Cpf: " + cpfUsuario + "]";
    }

}
