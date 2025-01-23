package com.example;

import com.example.src.usuario.Aluno;
import com.example.src.usuario.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("carlos", "12345678969");
        System.out.println(a1);
        System.out.println(a1.getTipoUsuario());

        Professor p1 = new Professor("jose", "98765432111");
        System.out.println(p1);
        System.out.println(p1.getTipoUsuario());
        
    }
}