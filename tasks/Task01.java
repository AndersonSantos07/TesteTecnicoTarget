package tasks;
/*
 * 
 *    Observe o trecho de código abaixo:
 *
 *  int INDICE = 13, SOMA = 0, K = 0;
 *
 *       enquanto K < INDICE faça
 *
 *          {
 *
 *               K = K + 1;
 *
 *               SOMA = SOMA + K; 
 *
 *           }
 *
 *   imprimir(SOMA);
 *
 *
 *
 *   Ao final do processamento, qual será o valor da variável SOMA?
 *   Resposta: 91.
 * 
 * 
 * 
 */
public class Task01 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da soma é: " + SOMA);
    }
}
