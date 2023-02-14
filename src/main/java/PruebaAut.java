public class PruebaAut {
    public static void main(String[] args) {
        Automovil Bocho = new Automovil();
        Automovil Chevy = new Automovil();

        Bocho.avanzar(30);
        Bocho.frenar();
        System.out.println(Bocho.getanio());
        System.out.println(Bocho.getkilometraje());
        System.out.println(Bocho.getmarca());
        System.out.println(Bocho.getsubmarca());
        System.out.println(Bocho.gettransmision());

        System.out.println("-------------------------------------------------");
        
        Chevy.avanzar(10);
        Chevy.frenar();
        Bocho.setanio(2000);
        Bocho.setkilometraje(1000);
        Bocho.setsubmarca("Chevy");
        Bocho.settransmision("Manual");
        
        System.out.println(Bocho.getanio());
        System.out.println(Bocho.getkilometraje());
        System.out.println(Bocho.getmarca());
        System.out.println(Bocho.getsubmarca());
        System.out.println(Bocho.gettransmision());



    }
}