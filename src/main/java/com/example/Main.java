package com.example;

import com.example.src.exemplar.Livro;
import com.example.src.exemplar.Revista;
import com.example.src.usuario.Aluno;
import com.example.src.usuario.Professor;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Assim falou Zaratustra", "123456");
        System.out.println(l1);
        System.out.println(l1.getTipoExemplar());

        Revista r1 = new Revista("Veja", "329865");
        System.out.println(r1);
        System.out.println(r1.getTipoExemplar());


        Aluno a1 = new Aluno("carlos", "12345678969");
        System.out.println(a1);
        System.out.println(a1.getTipoUsuario());

        Professor p1 = new Professor("jose", "98765432111");
        System.out.println(p1);
        System.out.println(p1.getTipoUsuario());
        
    }
}