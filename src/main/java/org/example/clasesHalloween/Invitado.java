package org.example.clasesHalloween;

public class Invitado {

    //ATRIBUTOS
    private String id;
    private String nombres;
    private int edad;
    private boolean aplicaCover;
    private String disfraz;


    //CONSTRUCTOR

    public Invitado() {
    }

    public Invitado(String id, String nombres, int edad, boolean aplicaCover, String disfraz) {
        this.id = id;
        this.nombres = nombres;
        this.edad = edad;
        this.aplicaCover = aplicaCover;
        this.disfraz = disfraz;
    }

    //METODOS


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad<18){
            System.out.println("No puedes entrar");
        }else if(edad>120){
            System.out.println("no puedes entrar matusalen");
        }else{
            this.edad=edad;
        }
    }

    public boolean isAplicaCover() {
        return aplicaCover;
    }

    public void setAplicaCover(boolean aplicaCover) {
        this.aplicaCover = aplicaCover;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }

    public void mostrarInvitado(){
        System.out.println("Identificacion: "+this.id);
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Edad: "+this.edad);
        System.out.println("Paga Cover: "+this.aplicaCover);
        System.out.println("Tipo Disfraz: "+this.disfraz);
    }

}
