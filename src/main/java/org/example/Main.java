package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        double estura;
        double peso;
        double IMC;

        System.out.print("Ingrese su estarua en metros: ");
        estura = leerDatos.nextDouble();
        System.out.print("Ingrese su peso en kilogramos: ");
        peso = leerDatos.nextDouble();

        IMC = peso/(Math.pow(estura,2));
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        String imcStr = decimalFormat.format(IMC);
        if(IMC <= 18.5){
            System.out.println("IMC: " + imcStr +" // Bajo peso");
        }else if (IMC >18.5 && IMC < 24.9 ){
            System.out.println("IMC: " + imcStr +" // Normal");
        } else if (IMC > 25.0 && IMC <= 29.9) {
            System.out.println("IMC: " + imcStr + " //Sobrepeso");
        }else{
            System.out.println("IMC: " + imcStr + " //Obesidad");
        };

    }
}