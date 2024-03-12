package tasks;
/*
 * Descubra a lógica e complete o próximo elemento:
 */

public class Task03 {

    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___
        int proximoA = 7 + 2;
        System.out.println("Próximo elemento para a sequência (1, 3, 5, 7, ___) é: " + proximoA);
        
        // b) 2, 4, 8, 16, 32, 64, ____
        int proximoB = 64 * 2;
        System.out.println("Próximo elemento para a sequência (2, 4, 8, 16, 32, 64, ____) é: " + proximoB);
        
        // c) 0, 1, 4, 9, 16, 25, 36, ____
        int proximoC = 36 + 49;
        System.out.println("Próximo elemento para a sequência (0, 1, 4, 9, 16, 25, 36, ____) é: " + proximoC);
        
        // d) 4, 16, 36, 64, ____
        int proximoD = 64 + 10 * 6;
        System.out.println("Próximo elemento para a sequência (4, 16, 36, 64, ____) é: " + proximoD);
        
        // e) 1, 1, 2, 3, 5, 8, ____
        int proximoE = 8 + 5;
        System.out.println("Próximo elemento para a sequência (1, 1, 2, 3, 5, 8, ____) é: " + proximoE);
        
        // f) 2,10, 12, 16, 17, 18, 19, ____
        int proximoF = 19 + 1;
        System.out.println("Próximo elemento para a sequência (2,10, 12, 16, 17, 18, 19, ____) é: " + proximoF);
    }
    
}
