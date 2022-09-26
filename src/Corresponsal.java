public class Corresponsal {
    String message_A(String nom){
        String msj = "Hola ";
        if (nom.equals("Jhonny")){
            msj = "Hola mi amor";
        }
        else
            msj = msj + nom;
        return msj;
    }
}
