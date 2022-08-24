package packageDatos;

public class datos {
    String name;
    String apelli;
    int dni;
    String lgrNaci;
    
    public datos(String name, String apelli, int dni, String lgrNaci) {
        this.name = name;
        this.apelli = apelli;
        this.dni = dni;
        this.lgrNaci = lgrNaci;
    }
    
    String mostrarDatos() {
        return "\nNombre : " + name + "\nApellidos : " + apelli + 
                "\nDNI : " + dni + "\nLugar de Nacimiento : " + lgrNaci;
    }
    
}
