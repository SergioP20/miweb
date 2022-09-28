import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Let's recommend you the rages date ages \n Enter your age");
        try{
            int age = sc.nextInt();
            System.out.println(SprintOne_Tasks.taskThirdteen(age));
        }catch(InputMismatchException l){
            System.err.println("Try to use only integer numbers");
            l.printStackTrace(System.out);
        }


    }
}