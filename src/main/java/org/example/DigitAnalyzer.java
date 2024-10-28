package org.example;


public class DigitAnalyzer {

    // Método para calcular a média dos dígitos
    public double averageOfDigits(int number) {
        int count = 0;
        int sum = 0;
        int absNumber = Math.abs(number); // Para lidar com números negativos

        while (absNumber > 0) {
            sum += absNumber % 10;
            absNumber /= 10;
            count++;
        }

        // Se não houver dígitos (caso de zero), evitar divisão por zero
        return count == 0 ? 0 : (double) sum / count;
    }
}
