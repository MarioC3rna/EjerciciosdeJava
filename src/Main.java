import java.util.Scanner;

public class Main {
    public static void holaMundo() {
        System.out.println("Holaaaaaaaa");
    }

    public static void sumardosnumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa los numeros que quieras sumar");
        System.out.println("Ingresa primer numero");
        int n1 = scanner.nextInt();
        System.out.println("Ingresa segundo numero");
        int n2 = scanner.nextInt();
        int suma1 = n1 + n2;
        System.out.println("La suma es: " + suma1);
    }
    public static void ParEimpar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese el numero que desea saber si es par o impar");
        int n3 = scanner.nextInt();
        if (n3%2==0){
            System.out.println("El numero es par");}
        else{
            System.out.println("El numero es impar");
        }
    }
    public static void factorialdeunNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea factorial");
        int n4 = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n4; i++) {
            factorial *= i;
        }
        System.out.println("Su factural del numero"+n4+" es: " + factorial);
    }
    public static void Tablamultiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para generar la tabla ");
        int n5 = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado1 = n5*i;
            System.out.println(n5+" * "+i+" = "+resultado1);
        }
    }
    public static void MayorOMenordeunaserie() {
        Scanner scanner = new Scanner(System.in);
        int n6, numMayor, numMenor;
        numMayor = Integer.MIN_VALUE;
        numMenor = Integer.MAX_VALUE;

        do {
            System.out.println("Ingrese un número entero positivo o un número negativo para finalizar");
            n6 = scanner.nextInt();

            if (n6 >= 0) {
                if (n6 > numMayor) {
                    numMayor = n6;
                }
                if (n6 < numMenor) {
                    numMenor = n6;
                }
            }
        } while (n6 >= 0);

        if (numMayor == Integer.MIN_VALUE && numMenor == Integer.MAX_VALUE) {
            System.out.println("No se ingresaron números positivos.");
        } else {
            System.out.println(numMayor + " es el número mayor de todos los que ingresó.");
            System.out.println(numMenor + " es el número menor de todos los que ingresó.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("--------Menu--------");
            System.out.println("1. Hola Mundo :D");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Numero mayor y Menor de una serie");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumardosnumero();
                    break;
                case 3:
                    ParEimpar();
                    break;
                case 4:
                    factorialdeunNumero();
                    break;
                case 5:
                    Tablamultiplicar();
                    break;
                case 6:
                    MayorOMenordeunaserie();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 7);

        scanner.close() ;
    }
}