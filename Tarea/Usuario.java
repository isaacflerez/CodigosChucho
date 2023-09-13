import java.util.Scanner;


public class Usuario {
    public int pedirNumero(){
        System.out.println("Digite un número entero ");
        Scanner s=new Scanner(System.in);
        return s.nextInt();
    }
}
