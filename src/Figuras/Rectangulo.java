package Figuras;

public class Rectangulo {
    int base; // Atributo que define la base de un rectángulo
    int altura; // Atributo que define la altura de un rectángulo

    Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    } //Creación del constructor para la clase rectángulo que recibe dos parametros, base y altura
    
    double calcularArea() {
    return base * altura;
    } //Método que calcula el área del rectángulo
    
    double calcularPerimetro() {
    return (2 * base) + (2 * altura);
    } //Método que calcula el perímetro del rectángulo
}
