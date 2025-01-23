package com.example.src.usuario;

/**
 * Classe Aluno que estende Usuário
 */
public class Aluno extends Usuario {
    
    private final String TIPO_USUARIO = "Aluno";

    /**
     * Método Construtor
     * 
     * @param nomeUsuario
     * @param cpfUsuario
     */
    public Aluno(String nomeUsuario, String cpfUsuario) {
        super(nomeUsuario, cpfUsuario);
    }

    /**
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
