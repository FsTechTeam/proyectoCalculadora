/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisiscalculadora;

import Estructura.*;
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
        Calculadora calculadora=new Calculadora();
        
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
                        Suma suma=new Suma();
                        System.out.println("Ingrese el primer Operando:");
                        suma.Op1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        suma.Op2 = Integer.parseInt(in.readLine());
                        
                        calculadora.setTipoOperacion(suma);
                        calculadora.EjecutarOperacion();
                        calculadora.ImprimirResultado();
                        
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
                        Resta resta=new Resta();
                        System.out.println("Ingrese el primer Operando:");
                        resta.Op1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        resta.Op2 = Integer.parseInt(in.readLine());

                        calculadora.setTipoOperacion(resta);
                        calculadora.EjecutarOperacion();
                        calculadora.ImprimirResultado();
                        
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
                        Multiplicacion multiplicacion=new Multiplicacion();
                        System.out.println("Ingrese el primer Operando:");
                        multiplicacion.Op1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        multiplicacion.Op2= Integer.parseInt(in.readLine());

                        calculadora.setTipoOperacion(multiplicacion);
                        calculadora.EjecutarOperacion();
                        calculadora.ImprimirResultado();
                        
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
                        Division division=new Division();
                        
                        System.out.println("Ingrese el primer Operando:");
                        division.Op1 = Integer.parseInt(in.readLine());
                        System.out.println("Ingrese el segundo Operando:");
                        division.Op2 = Integer.parseInt(in.readLine());

                        calculadora.setTipoOperacion(division);
                        calculadora.EjecutarOperacion();
                        calculadora.ImprimirResultado();
                        
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
