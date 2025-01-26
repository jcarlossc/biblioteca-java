package com.example.src.calendario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe Calendário.
 * 
 * @author Carlos da Costa.
 * @version 1.0
 */
public class Calendario {
    
    private LocalDate data;
    private LocalTime hora;
    private LocalDate dataDevolucao;

    /**
     * Método construtor.
     */
    public Calendario() {
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
        this.dataDevolucao = data.plusDays(10);
    }

    /**
     * Método para gerar data.
     * 
     * @return data atual.
     */
    public String getData() {
        return this.data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    /**
     * Método para gerar hora.
     * 
     * @return hora atual.
     */
    public String getHora() {
        return this.hora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    /**
     * Método para gerar data da devolução.
     * 
     * @return data da devolução.
     */
    public String getDataEntrega() {
        return this.dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    /**
     * Converte Objeto para string.
     * 
     * @return representação string do Objeto.
     */
    @Override
    public String toString() {
        return "Calendario [data=" + data + ", hora=" + hora + ", dataDevolucao=" + dataDevolucao + "]";
    }

    
}
