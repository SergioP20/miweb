public class Corresponsal {
    public static String menssage_A(String nom){
        String msj = "Hola ";
        if (nom.equals("Jhonny")){
            msj = "Hello my love, my dear Jhonny";
        }
        else
            msj = msj + nom;
        return msj;
    }
}
