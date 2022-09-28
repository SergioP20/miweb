import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let's greet!    Insert your name");
        String name = "";
        Scanner n = new Scanner(System.in);
        name = n.nextLine();
        System.out.println(Corresponsal.menssage_A(name));

    }
}