package Figuras;

public class Circulo {
        int radio; //Atributo que define el radio del círculo
        
        Circulo(int radio) {
        this.radio = radio;
        } //Creación del constructor para la clase círculo que recibe un parametro llamado radio
        
        double calcularArea() {
        return Math.PI*Math.pow(radio,2);
        } //Creación del método que calcula el área del círculo dado
 
        double calcularPerimetro() {
        return 2*Math.PI*radio;
        } //Creación del método que calcula el perímetro del círculo dado
}