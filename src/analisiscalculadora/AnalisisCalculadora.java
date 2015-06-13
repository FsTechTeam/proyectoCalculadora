/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisiscalculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author Geek
 */
public class AnalisisCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /*Menu de la aplicacion*/
        /*las funciones deben devolver enteros a excepcion de la division y las trigonometricas*/
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int subopcion;
        int opcion;
        int operando1 = 0, operando2 = 0;
        float Resultado = 0;
        System.out.println("\033[36mEscoja una opcion:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");

        try {

            opcion = Integer.parseInt(in.readLine());
            switch (opcion) {

                case 1:
                    /*suma*/
                    try {
                        System.out.println("Ingrese el primer Operando:");
                        operando1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        operando2 = Integer.parseInt(in.readLine());

                        /*Resultado=llamada a funcion sumar*/
                        /* System.out.println("el resultado es: "+Resultado);*/
                        /*submenu*/
                        System.out.println("\033[36mDesea realizar otra operacion?: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        try {
                            subopcion = Integer.parseInt(in.readLine());
                            switch (subopcion) {
                                case 1:
                                    AnalisisCalculadora.main(args);
                                case 2:
                                    System.exit(0);
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("\033[31mPor favor ingrese una de las Opciones indicadas");
                            AnalisisCalculadora.main(args);
                        }

                    } catch (NumberFormatException err) {
                        System.out.println("\033[31mPor favor solo ingrese numeros enteros");
                        AnalisisCalculadora.main(args);
                    }

                case 2:/*resta*/

                    try {
                        System.out.println("Ingrese el primer Operando:");
                        operando1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        operando2 = Integer.parseInt(in.readLine());

                        /*Resultado=llamada a funcion restar*/
                        /* System.out.println("el resultado es: "+Resultado);*/
                        /*submenu*/
                        System.out.println("\033[36mDesea realizar otra operacion?: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        try {
                            subopcion = Integer.parseInt(in.readLine());
                            switch (subopcion) {
                                case 1:
                                    AnalisisCalculadora.main(args);
                                case 2:
                                    System.exit(0);
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("\033[31mPor favor ingrese una de las Opciones indicadas");
                            AnalisisCalculadora.main(args);
                        }

                    } catch (NumberFormatException err) {
                        System.out.println("\033[31mPor favor solo ingrese numeros enteros");
                        AnalisisCalculadora.main(args);
                    }

                case 3:
                    /*multiplicacion*/

                    try {
                        System.out.println("Ingrese el primer Operando:");
                        operando1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        operando2 = Integer.parseInt(in.readLine());

                        /*Resultado=llamada a funcion multiplicar*/
                        /* System.out.println("el resultado es: "+Resultado);*/
                        /*submenu*/
                        System.out.println("\033[36mDesea realizar otra operacion?: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        try {
                            subopcion = Integer.parseInt(in.readLine());
                            switch (subopcion) {
                                case 1:
                                    AnalisisCalculadora.main(args);
                                case 2:
                                    System.exit(0);
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("\033[31mPor favor ingrese una de las Opciones indicadas");
                            AnalisisCalculadora.main(args);
                        }

                    } catch (NumberFormatException err) {
                        System.out.println("\033[31mPor favor solo ingrese numeros enteros");
                        AnalisisCalculadora.main(args);
                    }

                case 4:
                    /*division*/
                    try {
                        System.out.println("Ingrese el primer Operando:");
                        operando1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        operando2 = Integer.parseInt(in.readLine());

                        /*Resultado=llamada a funcion dividir*/
                        /* System.out.println("el resultado es: "+Resultado);*/
                        /*submenu*/
                        System.out.println("\033[36mDesea realizar otra operacion?: ");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        try {
                            subopcion = Integer.parseInt(in.readLine());
                            switch (subopcion) {
                                case 1:
                                    AnalisisCalculadora.main(args);
                                case 2:
                                    System.exit(0);
                            }
                        } catch (NumberFormatException ex) {
                            System.out.println("\033[31mPor favor ingrese una de las Opciones indicadas");
                            AnalisisCalculadora.main(args);
                        }

                    } catch (NumberFormatException err) {
                        System.out.println("\033[31mPor favor solo ingrese numeros enteros");
                        AnalisisCalculadora.main(args);
                    }

                case 5:
                    System.exit(0);
            }
        } catch (NumberFormatException ex) {
            System.out.println("\033[31mPor favor ingrese alguno de los numeros indicados");
            AnalisisCalculadora.main(args);

        }
    }

}
