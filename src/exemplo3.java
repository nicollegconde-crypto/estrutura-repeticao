import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, contador;

        System.out.println("Inicio do intervalo --> ");
        inicio= sc.nextInt();
        System.out.println("Fim do intervaloo --> ");
        fim = sc.nextInt();

        if (inicio % 2 ==0){
            contador = inicio + 1;
        }
        else{
            contador = inicio;
        }
        while(contador <= fim){
           contador = contador + 2;
        }


    }
}
