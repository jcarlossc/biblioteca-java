package com.example.src.usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    Aluno a1 = new Aluno("carlos", "12345678989");
    Aluno a2 = new Aluno("soares", "98765432111");

    @Test
    void testEquals() {
        assertEquals(true, a1.equals(a1));
        assertNotEquals(true, a1.equals(a2));
    }

    @Test
    void testGetCpfUsuario() {
        assertEquals("12345678989", a1.getCpfUsuario());
    }

    @Test
    void testGetNomeUsuario() {
        assertEquals("carlos", a1.getNomeUsuario());
    }

    @Test
    void testGetTipoUsuario() {
        assertEquals("Aluno", a1.getTipoUsuario());
    }

    @Test
    void testHashCode() {
        assertEquals(1299652155, a1.hashCode());
    }  

    @Test
    void testToString() {
        assertEquals("Tipo de usuário: Aluno | Nome: carlos | Cpf: 12345678989", a1.toString());
    }
}
