package Figuras;

    public class Cuadrado {
        int lado; // Atributo que define el lado de un cuadrado

    public Cuadrado(int lado) {
    this.lado = lado;
    } //Creación del constructor para la clase cuadrado que recibe un parametro llamado lado
    
    double calcularArea() {
    return lado*lado;
    } //Método que calcula el área del cuadrado
    
    double calcularPerimetro() {
    return (4*lado);
    } //Método que calcula el perímetro del cuadrado
}
