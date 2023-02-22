package com.sistecredito.utils;


import java.util.Random;
import java.util.HashSet;

public class GenerarNumero {

    private static Random random = new Random();
    private static HashSet<Integer> usedNumbers = new HashSet<>();

    public static int getRandomNumber(int maximo) {
        int number = random.nextInt(maximo - 1);
        while (usedNumbers.contains(number)) {
            number = random.nextInt(maximo - 1);
        }
        usedNumbers.add(number);
        return number;
    }

    public static Integer cantidadProductos(){
        return random.nextInt(5);
    }
}

