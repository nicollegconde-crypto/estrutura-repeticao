import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, contador;

        System.out.print("Início do intervalo --> ");
        inicio= sc.nextInt();
        System.out.print("Fim do intervalo --> ");
        fim= sc.nextInt();
        contador = inicio;
        while(contador <= fim){
            System.out.print(contador + " ");
            contador = contador + 1;
        }
    }
}
