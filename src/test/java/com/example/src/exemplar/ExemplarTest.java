package com.example.src.exemplar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class ExemplarTest {

    Livro l1 = new Livro("Assim falou Zaratustra", "Friedrich Nietzsche", "789456");
    Livro l2 = new Livro("Humano, demasiado humano", "Friedrich Nietzsche", "123456");

    @Test
    void testEquals() {
        assertEquals(true, l1.equals(l1));
        assertNotEquals(true, l1.equals(l2));
    }

    @Test
    void testGetAutor() {
        assertEquals("Friedrich Nietzsche", l1.getAutor());
    }

    @Test
    void testGetNomeExemplar() {   
        assertEquals("Assim falou Zaratustra", l1.getNomeExemplar());
    }

    @Test
    void testGetNumeroCadastro() {
        assertEquals("789456", l1.getNumeroCadastro());
    }

    @Test
    void testGetTipoExemplar() {
        assertEquals("Livro", l1.getTipoExemplar());
    }

    @Test
    void testHashCode() {
        assertEquals(-220865198, l1.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("[Tipo de exemplar: Livro | Nome: Assim falou Zaratustra | Autor: Friedrich Nietzsche | Número de cadastro: 789456]", l1.toString());
    }
}
