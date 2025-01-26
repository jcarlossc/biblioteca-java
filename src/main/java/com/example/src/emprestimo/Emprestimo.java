package com.example.src.emprestimo;

import java.util.ArrayList;
import java.util.List;
import com.example.src.calendario.Calendario;
import com.example.src.exemplar.Exemplar;
import com.example.src.usuario.Usuario;

/**
 * Classe Empréstimo: centraliza operações.
 * 
 * @author Carlos da Costa.
 * @version 1.0
 */
public class Emprestimo {
    
    private Usuario usuario;
    private List<Exemplar> listaExemplares;
    private Calendario calendario;
    private StringBuilder stringEmprestimo;

    /**
     * Método construtor.
     * 
     * @param usuario
     */
    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
        this.listaExemplares = new ArrayList<>();
        this.calendario = new Calendario();
        this.stringEmprestimo = new StringBuilder();
    }

    /**
     * Método que adiciona exemplares.
     * Máximo de três exemplares.
     * 
     * @param exemplar
     */
    public void addEmprestimo(Exemplar exemplar) {
        try {
            if(listaExemplares.size() <= 2) {
                listaExemplares.add(exemplar);
            }
        } catch (Exception e) {
            System.err.println("Número de exemplares excedido. " + e.getMessage());
        }
    }

    /**
     * 
     * @return usuário
     */
    public Usuario getUsuario() {
        return usuario;
    }
    
    /**
     * Método que imprime 
     */
    public void listarEmprestimos() {
        
        stringEmprestimo.append("\n--- EMPRÉSTIMO\n");
        stringEmprestimo.append("Nome: " + usuario.getNomeUsuario() + "\n");
        stringEmprestimo.append("Cpf: " + usuario.getCpfUsuario() + "\n");
        stringEmprestimo.append("Tipo de usuário: " + usuario.getTipoUsuario() + "\n");
        stringEmprestimo.append("Data do empréstimo: " + calendario.getData() + "\n");
        stringEmprestimo.append("Horário: " + calendario.getHora() + "\n");
        stringEmprestimo.append("Data da devolução: " + calendario.getDataEntrega() + "\n");
        stringEmprestimo.append("--- LISTA DE EXEMPLARES");
        System.out.println(stringEmprestimo);
        try {
            if(!listaExemplares.isEmpty()) {
                listaExemplares.stream()
                    .forEach(System.out::println); 
            }
        } catch (Exception e) {
            System.out.println("Lista vazia. " + e.getMessage());
        }
    }

}
