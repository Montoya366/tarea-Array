
//Nombre: Ervin Enmanuel Molina Montoya
//Nº Carnet: 2024-1691U      Grupo: 1M7s
// arrays invertido 
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void PedirValores(int arreglo[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            try {
                System.out.print("Ingrese el valor a agregar al arreglo: ");
                arreglo[i] = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Solo se aceptan valores enteros.....");
                sc.next(); 
                i--; 
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arreglo = PedirTamañoArreglo();
            PedirValores(arreglo);
            MostrarValores(arreglo);
            MostrarValoresInvertidos(arreglo);
        } catch (InputMismatchException e) {
            System.out.println("El valor debe ser de tipo entero....");
            main(args);
        }
        sc.close();
    }

    public static void MostrarValores(int arreglo[]) {
        System.out.print("\nSus valores ingresados son: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ", ");
        }
    }

    public static void MostrarValoresInvertidos(int arreglo[]) {
        System.out.print("\nSus valores ingresados de manera inversa son: ");
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + ", ");
        }
    }

    public static int[] PedirTamañoArreglo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de valores a ingresar: ");
        int tamaño = sc.nextInt();
        if (tamaño <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return PedirTamañoArreglo();
        }
        int arreglo[] = new int[tamaño];
        return arreglo;
    }
}