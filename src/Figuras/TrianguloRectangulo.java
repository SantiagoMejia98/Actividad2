package Figuras;

    public class TrianguloRectangulo {
        int base; // Atributo que define la base del triángulo
        int altura; // Atributo que define la altura del triángulo

        public TrianguloRectangulo(int base, int altura) {
        this.base = base; 
        this.altura = altura; 
        } //Método constructor del triángulo rectángulo

        double calcularArea() {
        return (base * altura / 2);
        } // Método para calcular el área del triángulo

        double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); 
        } // Método para calcular el perímetro del triángulo

        double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
        } // Método para calcular la hipotenusa del triángulo

        void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
        System.out.println("Es un triángulo equilátero");

        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        System.out.println("Es un triángulo escaleno"); 

        else
        System.out.println("Es un triángulo isósceles");

        }
}
