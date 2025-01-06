
import java.util.Scanner;

/*

 */
public class Ejercicio03 {

    public static void main(String[] args) {
        String[] Nombres = {
            "Ana", "Diego", "Sofía", "Mateo", "Valeria", "Lucas", "Camila", "Alejandro",
            "María", "Sebastián", "Isabel", "Andrés", "Natalia", "Daniel", "Laura",
            "Javier", "Clara", "Pablo", "Gabriela", "Tomás", "Mariana", "Rodrigo",
            "Victoria", "Martín", "Andrea", "Emiliano", "Elena", "Samuel"
        };
        Scanner tcl = new Scanner(System.in);
        double[][] Notas = new double[28][3];
        double[] Prom = new double[28];
        String mayor = "", menor = "";
        double promtotal = 0, mejor = 0, peor = 5;
        for (int i = 0; i < 28; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Ingrese la nota del ACD de " + Nombres[i] + ": ");
                        Notas[i][j] = tcl.nextDouble() * 0.35;
                        break;
                    case 1:
                        System.out.print("Ingrese la nota del APE de " + Nombres[i] + ": ");
                        Notas[i][j] = tcl.nextDouble() * 0.35;
                        break;
                    case 2:
                        System.out.print("Ingrese la nota del AA de " + Nombres[i] + ": ");
                        Notas[i][j] = tcl.nextDouble() * 0.30;
                        break;
                    default:
                        break;
                }
                Prom[i] += Notas[i][j];
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < Nombres.length; i++) {
            System.out.printf("El promedio de %s es: %.2f\n", Nombres[i], Prom[i]);
            promtotal += Prom[i];
        }
        promtotal = promtotal / 28;
        System.out.println("-------------------------------------------------");
        System.out.printf("El promedio del curso es: %.2f \n", +promtotal);
        System.out.println("-------------------------------------------------");
        System.out.println("Los estudiantes por arriba del promedio del curso son: ");
        for (int i = 0; i < Nombres.length; i++) {
            if (promtotal < Prom[i]) {
                System.out.printf(Nombres[i] + "con: %.2f\n", Prom[i]);
            }
            if (mejor < Prom[i]) {
                mejor = Prom[i];
                mayor = Nombres[i];
            } else if (peor > Prom[i]) {
                peor = Prom[i];
                menor = Nombres[i];
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Los estudiantes por debajo del promedio del curso son :");
        for (int i = 0; i < Nombres.length; i++) {
            if (promtotal > Prom[i]) {
                System.out.printf(Nombres[i] + "con: %.2f\n", Prom[i]);
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.printf("El mejor promedio es de: " + mayor + " con: %.2f\n", mejor);
        System.out.printf("El peor promedio es de: " + menor + " con: %.2f", peor);
    }
}
/*
run:
Ingrese la nota del ACD de Ana: 8
Ingrese la nota del APE de Ana: 9
Ingrese la nota del AA de Ana: 10
Ingrese la nota del ACD de Diego: 9
Ingrese la nota del APE de Diego: 10
Ingrese la nota del AA de Diego: 9.5
Ingrese la nota del ACD de Sof�a: 6.5
Ingrese la nota del APE de Sof�a: 9.5
Ingrese la nota del AA de Sof�a: 8
Ingrese la nota del ACD de Mateo: 5
Ingrese la nota del APE de Mateo: 9
Ingrese la nota del AA de Mateo: 7
Ingrese la nota del ACD de Valeria: 6
Ingrese la nota del APE de Valeria: 7
Ingrese la nota del AA de Valeria: 4
Ingrese la nota del ACD de Lucas: 5
Ingrese la nota del APE de Lucas: 6
Ingrese la nota del AA de Lucas: 8
Ingrese la nota del ACD de Camila: 9
Ingrese la nota del APE de Camila: 5
Ingrese la nota del AA de Camila: 6
Ingrese la nota del ACD de Alejandro: 7
Ingrese la nota del APE de Alejandro: 4
Ingrese la nota del AA de Alejandro: 5
Ingrese la nota del ACD de Mar�a: 8
Ingrese la nota del APE de Mar�a: 7
Ingrese la nota del AA de Mar�a: 4
Ingrese la nota del ACD de Sebasti�n: 5
Ingrese la nota del APE de Sebasti�n: 8
Ingrese la nota del AA de Sebasti�n: 9
Ingrese la nota del ACD de Isabel: 6
Ingrese la nota del APE de Isabel: 8
Ingrese la nota del AA de Isabel: 7
Ingrese la nota del ACD de Andr�s: 4
Ingrese la nota del APE de Andr�s: 5
Ingrese la nota del AA de Andr�s: 9
Ingrese la nota del ACD de Natalia: 6
Ingrese la nota del APE de Natalia: 3
Ingrese la nota del AA de Natalia: 5
Ingrese la nota del ACD de Daniel: 2
Ingrese la nota del APE de Daniel: 3
Ingrese la nota del AA de Daniel: 6
Ingrese la nota del ACD de Laura: 4
Ingrese la nota del APE de Laura: 6
Ingrese la nota del AA de Laura: 3
Ingrese la nota del ACD de Javier: 5
Ingrese la nota del APE de Javier: 4
Ingrese la nota del AA de Javier: 7
Ingrese la nota del ACD de Clara: 5
Ingrese la nota del APE de Clara: 6
Ingrese la nota del AA de Clara: 4
Ingrese la nota del ACD de Pablo: 2
Ingrese la nota del APE de Pablo: 3
Ingrese la nota del AA de Pablo: 9
Ingrese la nota del ACD de Gabriela: 8
Ingrese la nota del APE de Gabriela: 9
Ingrese la nota del AA de Gabriela: 8
Ingrese la nota del ACD de Tom�s: 7
Ingrese la nota del APE de Tom�s: 8
Ingrese la nota del AA de Tom�s: 9
Ingrese la nota del ACD de Mariana: 10
Ingrese la nota del APE de Mariana: 8
Ingrese la nota del AA de Mariana: 9
Ingrese la nota del ACD de Rodrigo: 7
Ingrese la nota del APE de Rodrigo: 10
Ingrese la nota del AA de Rodrigo: 8
Ingrese la nota del ACD de Victoria: 9
Ingrese la nota del APE de Victoria: 8
Ingrese la nota del AA de Victoria: 7
Ingrese la nota del ACD de Mart�n: 9
Ingrese la nota del APE de Mart�n: 5
Ingrese la nota del AA de Mart�n: 6
Ingrese la nota del ACD de Andrea: 7
Ingrese la nota del APE de Andrea: 8
Ingrese la nota del AA de Andrea: 5
Ingrese la nota del ACD de Emiliano: 6
Ingrese la nota del APE de Emiliano: 7
Ingrese la nota del AA de Emiliano: 8
Ingrese la nota del ACD de Elena: 6
Ingrese la nota del APE de Elena: 5
Ingrese la nota del AA de Elena: 8
Ingrese la nota del ACD de Samuel: 7
Ingrese la nota del APE de Samuel: 5
Ingrese la nota del AA de Samuel: 6
-------------------------------------------------
El promedio de Ana es: 8.95
El promedio de Diego es: 9.50
El promedio de Sof�a es: 8.00
El promedio de Mateo es: 7.00
El promedio de Valeria es: 5.75
El promedio de Lucas es: 6.25
El promedio de Camila es: 6.70
El promedio de Alejandro es: 5.35
El promedio de Mar�a es: 6.45
El promedio de Sebasti�n es: 7.25
El promedio de Isabel es: 7.00
El promedio de Andr�s es: 5.85
El promedio de Natalia es: 4.65
El promedio de Daniel es: 3.55
El promedio de Laura es: 4.40
El promedio de Javier es: 5.25
El promedio de Clara es: 5.05
El promedio de Pablo es: 4.45
El promedio de Gabriela es: 8.35
El promedio de Tom�s es: 7.95
El promedio de Mariana es: 9.00
El promedio de Rodrigo es: 8.35
El promedio de Victoria es: 8.05
El promedio de Mart�n es: 6.70
El promedio de Andrea es: 6.75
El promedio de Emiliano es: 6.95
El promedio de Elena es: 6.25
El promedio de Samuel es: 6.00
-------------------------------------------------
El promedio del curso es: 6.63 
-------------------------------------------------
Los estudiantes por arriba del promedio del curso son: 
Anacon: 8.95
Diegocon: 9.50
Sof�acon: 8.00
Mateocon: 7.00
Camilacon: 6.70
Sebasti�ncon: 7.25
Isabelcon: 7.00
Gabrielacon: 8.35
Tom�scon: 7.95
Marianacon: 9.00
Rodrigocon: 8.35
Victoriacon: 8.05
Mart�ncon: 6.70
Andreacon: 6.75
Emilianocon: 6.95
---------------------------------------------------
Los estudiantes por debajo del promedio del curso son :
Valeriacon: 5.75
Lucascon: 6.25
Alejandrocon: 5.35
Mar�acon: 6.45
Andr�scon: 5.85
Nataliacon: 4.65
Danielcon: 3.55
Lauracon: 4.40
Javiercon: 5.25
Claracon: 5.05
Pablocon: 4.45
Elenacon: 6.25
Samuelcon: 6.00
---------------------------------------------------
El mejor promedio es de: Diego con: 9.50
El peor promedio es de: Daniel con: 3.55
*/