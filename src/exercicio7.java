import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int voto = 1;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;
        int invalido = 0;
        int total;
        double pc1, pc2, pc3;

        while (voto != 0) {
            System.out.print("[1] Candidato 1\n" +
                    "[2] Candidato 2\n" +
                    "[3] Candidato 3\n" +
                    "[0] Finalizar \n");
            voto = sc.nextInt();

        if (voto == 0) {
            break;
        }

        if (voto == 1) {
            candidato1++;
        } else if (voto == 2) {
            candidato2++;
        } else if (voto == 3) {
            candidato3++;
        }
        else {
            invalido++;
        }
    }
        System.out.println("Candidato 1 =" + candidato1);
        System.out.println("Candidato 2 =" + candidato2);
        System.out.println("Candidato 3 =" + candidato3);
        System.out.println("Inválido " + invalido);

    // calcular o total de votos
        total= candidato1 + candidato2 + candidato3;
        pc1 =(double) candidato1/ total * 100;
        pc2 = (double) candidato2/ total * 100;
        pc3 = (double) candidato3/ total * 100;

        System.out.println("Total de votos =" + total);
        System.out.println("Porcentagem do candidato 1 =" + pc1);
        System.out.println("Porcentagem do candidato 2 =" + pc2);
        System.out.println("Porcentagem do candidato 3 =" + pc3);

        if (candidato1 > candidato2 && candidato1 > candidato3){
            System.out.println("Vencedor --> Candidato 1");
        } else if (candidato2 > candidato3) {
            System.out.println("Vencedor --> Candidato 2");
        }
        else {
            System.out.println("Vencedor --> Candidato 3");
        }
    }
}
