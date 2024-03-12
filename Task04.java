/*
 * 
 *  Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está,
 *  mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.
 *  Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?
 * 
 */


public class Task04 {

    public static void main(String[] args) {
        // Aqui representaremos os interruptores e lâmpadas com valores booleanos, onde true = ligado e false = desligado.
        boolean interruptor1, interruptor2, interruptor3;
        boolean lampada1, lampada2, lampada3;
        
        // 1ª ida
        interruptor1 = true;
        interruptor2 = false;
        interruptor3 = false;
        
        // 2ª ida
        interruptor1 = false;
        interruptor2 = true;
        interruptor3 = !interruptor3; // Invertemos o estado do interruptor 3
        
        // Lógica para determinar qual interruptor controla qual lâmpada
        lampada1 = interruptor1 || interruptor3; // Interruptor 3 está incluído na lógica
        lampada2 = interruptor2 && !interruptor3; // Interruptor 3 também é considerado
        lampada3 = interruptor1 && interruptor2;
        
        System.out.println("O interruptor 1 controla a lâmpada 1? " + lampada1);
        System.out.println("O interruptor 2 controla a lâmpada 2? " + lampada2);
        System.out.println("O interruptor 3 controla a lâmpada 3? " + lampada3);

        if(lampada2 == false && lampada3 == false){
            System.out.println("então: ");
            System.out.println("O interruptor 3 controla a lâmpada 2? " + true);
            System.out.println("O interruptor 2 controla a lâmpada 3? " + true);


        }
    }
    
}
