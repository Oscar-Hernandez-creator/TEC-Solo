public class Automovil {
    private String marca; 
    private String submarca;
    private String transmision;
    private int anio;
    private int kilometraje;


    public Automovil(){
        marca = "Wolsvagen";
        submarca = "Beatle";
        transmision = "Manual";
        anio = 1999;
        kilometraje = 100;
    }


    public void avanzar(int km){
        System.out.println("Estoy avanzando a " + km + "/h");
    }

    public void frenar(){
        System.out.println("Estoy frenado");
    }

    public void setmarca(String marca){
        this.marca = marca;
    }

    public String getmarca(){
        return marca;
    }

    public void setsubmarca(String submarca){
        this.submarca = submarca;
    }

    public String getsubmarca(){
        return submarca;
    }    

    public void settransmision(String transmision){
        this.transmision = transmision;
    }

    public String gettransmision(){
        return transmision;
    }

    public void setanio(int anio){
        this.anio = anio;
    }

    public int getanio(){
        return anio;
    }  

    public void setkilometraje(int kilometraje){
        this.kilometraje = kilometraje;
    }

    public int getkilometraje(){
        return kilometraje;
    } 
}