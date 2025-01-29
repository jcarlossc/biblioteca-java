package com.example;

import com.example.src.emprestimo.Emprestimo;
import com.example.src.exemplar.Livro;
import com.example.src.exemplar.Revista;
import com.example.src.usuario.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("carlos", "12345678989");

        Livro l1 = new Livro("Assim falou Zaratustra", "Friedrich Nietzsche", "789456");
        Livro l2 = new Livro("Humano, demasiado humano", "Friedrich Nietzsche", "123456");
        Revista r1 = new Revista("Veja", "Abril", "456789");
        //Revista r2 = new Revista("Isto é", "bril", "232323");

        Emprestimo e1 = new Emprestimo(aluno);
        e1.addEmprestimo(l1);
        e1.addEmprestimo(l2);
        e1.addEmprestimo(r1);

        e1.listarEmprestimos();

        //System.out.println(l1.toString());
        System.out.println(e1.getUsuario());
    }
}