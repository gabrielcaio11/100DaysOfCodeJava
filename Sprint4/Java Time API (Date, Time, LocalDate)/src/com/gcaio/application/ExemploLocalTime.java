package com.gcaio.application;

import java.time.LocalTime;

public class ExemploLocalTime {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        LocalTime horaDoCafe = LocalTime.of(10, 30);
        LocalTime horarioDeDormir = LocalTime.parse("22:00:00");

        System.out.println("Hora atual: " + agora);
        System.out.println("Hora do café: " + horaDoCafe);
        System.out.println("Horário de dormir: " + horarioDeDormir);

        LocalTime daquiUmaHora = agora.plusHours(1);
        System.out.println("Daqui a uma hora: " + daquiUmaHora);

        boolean isAntes = agora.isBefore(horarioDeDormir);
        System.out.println("Agora é antes do horário de dormir? " + isAntes);

        int hora = agora.getHour();
        int minuto = agora.getMinute();
        System.out.println("Hora: " + hora + ", Minuto: " + minuto);
    }
}

