import java.util.Scanner;
import java.lang.Math;
public class ExJava {
    public static void main(String[]args){
        Scanner receber = new Scanner (System.in);

        int [] vetA = new int[5];
        int [] vetB = new int[5];
        double [] vetC = new double[5];
        double resdiv;
            System.out.println("Preencha o Vetor de 5 Posições: ");
                    for (int i = 0;i < 5;i++){
                        System.out.println("Vetor A [" + (i + 1) + "]: ");
                        vetA[i] = receber.nextInt();
                    }
        System.out.println("Preencha o Vetor de 5 Posições: ");
        for (int i = 0;i < 5;i++){
            System.out.println("Vetor B [" + (i + 1) + "]: ");
            vetB[i] = receber.nextInt();
        }

        for (int i = 0;i < vetA.length; i++) {
            resdiv = vetA[i] % 2;
            if (resdiv == 0) {
                vetC[i] = (vetA[i] * vetB[i]);
                System.out.println("Vetor A Posição " + i + " é Par, Então o Vetor C, irá receber o produto do Vetor A com B:");
                System.out.println("Resultado é: " + vetC[i]);
            } else {
                vetC[i] = Math.pow(vetA[i], vetB[i]);
                System.out.println("Vetor A Posição " + i + " Sendo Impar, O Vetor C receberá A Elevado a B: ");
                System.out.println("Resultado é: " + vetC[i]);
            }
        }
    }
}