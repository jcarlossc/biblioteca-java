package com.example.src.usuario;

/**
 * Classe Professor que estende Usuário
 * 
 * @author Carlos da Costa
 * @version 1.0
 */
public class Professor extends Usuario {

    private final String TIPO_USUARIO = "Professor";

     /**
     * Método Construtor
     * 
     * @param nomeUsuario
     * @param cpfUsuario
     */
    public Professor(String nomeUsuario, String cpfUsuario) {
        super(nomeUsuario, cpfUsuario);
    }

    /**
     * Método abstrato
     * 
     * @return tipo de usuário 
     */
    @Override
    public String getTipoUsuario() {
        return this.TIPO_USUARIO;
    }

    /**
     * Converte Objeto para string
     * 
     * @return representação string do Objeto
     */
    @Override
    public String toString() {
        return "Tipo de usuário: " + TIPO_USUARIO + " | " + "Nome: " + getNomeUsuario() + " | " + "Cpf: " + getCpfUsuario();
    }
}
