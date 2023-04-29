package ejercicio_tema_9;

public class Main {

    public static void main(String[] args){

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "Waldo Mauricio Balvin Cupen";
        cliente.edad = 26;
        cliente.telefono = 901626695;
        cliente.credito = 2000.50;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi celular es " + cliente.telefono
        + " y mi credito disponible es " + "S/. " + cliente.credito );


        trabajador.nombre = "Joaquin Balvin";
        trabajador.edad = 21;
        trabajador.telefono = 982095552;
        trabajador.salario = 1030.50;

        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años, mi celular es " + trabajador.telefono
                + " y mi salario es " + "S/. " + trabajador.salario );

    }
}



class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;

}

class Trabajador extends Persona {

    double salario;
}