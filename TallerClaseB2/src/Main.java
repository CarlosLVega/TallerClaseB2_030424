public class Main {
     public static void main(String[] args) {
       
        Persona persona = new Persona("Juan", 1990, 5, 15);
        System.out.println("Detalles de la persona:");
        System.out.println(persona);
        int edad = persona.calcularEdad();
        System.out.println("Edad: " + edad + " años");

       
        Cuadrado cuadrado = new Cuadrado(5);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

       
        Circulo circulo = new Circulo(3);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        
        Triangulo triangulo = new Triangulo(3, 4, 5);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
    }
}
