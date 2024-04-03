import java.time.LocalDate;

public class Persona {

    private String nombre;
    private int añoNacimiento;
    private int mesNacimiento;
    private int diaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, int añoNacimiento, int mesNacimiento, int diaNacimiento) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", añoNacimiento=" + añoNacimiento + ", mesNacimiento=" + mesNacimiento
                + ", diaNacimiento=" + diaNacimiento + "]";
    }
     
    
    public int calcularEdad() {
        LocalDate fechaNacimiento = LocalDate.of(añoNacimiento, mesNacimiento, diaNacimiento);
        LocalDate ahora = LocalDate.now();
        return ahora.getYear() - fechaNacimiento.getYear();
    }
    
 
}
