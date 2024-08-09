package com.gcaio.exemplos;

import java.time.LocalDateTime;
import java.time.Month;

public class ExemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime natal = LocalDateTime.of(2024, Month.DECEMBER, 25, 10, 30);
        LocalDateTime aniversario = LocalDateTime.parse("2024-08-15T14:30:00");

        System.out.println("Data e hora atuais: " + agora);
        System.out.println("Natal: " + natal);
        System.out.println("Aniversário: " + aniversario);

        LocalDateTime semanaQueVem = agora.plusDays(7);
        System.out.println("Daqui a uma semana: " + semanaQueVem);

        boolean isAntes = agora.isBefore(natal);
        System.out.println("Agora é antes do Natal? " + isAntes);

        int ano = agora.getYear();
        int minuto = agora.getMinute();
        System.out.println("Ano: " + ano + ", Minuto: " + minuto);

        // Extraindo data e hora separadamente
        System.out.println("Data: " + agora.toLocalDate());
        System.out.println("Hora: " + agora.toLocalTime());
    }
}
