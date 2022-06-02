import java.util.Scanner;

public class mostrarPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero por teclado");
        int total = teclado.nextInt();
        int i;
        for (i = 1; i > total; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
