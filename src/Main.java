import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creemos un saludo!    Ingresa tu nombre");
        String name = "";
        Scanner n = new Scanner(System.in);
        name = n.nextLine();

        Corresponsal obj = new Corresponsal();

        obj.message_A(name,"Hola");

    }
}